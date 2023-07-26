package io.github.primelib.prometheus4j;

import java.util.Map;
import javax.annotation.processing.Generated;
import lombok.Builder;

import io.github.primelib.prometheus4j.api.PrometheusHTTPApi;

import com.fasterxml.jackson.module.blackbird.BlackbirdModule;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.micrometer.MicrometerCapability;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import okhttp3.Credentials;

import io.github.resilience4j.bulkhead.BulkheadRegistry;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.micrometer.tagged.TaggedBulkheadMetrics;
import io.github.resilience4j.micrometer.tagged.TaggedCircuitBreakerMetrics;
import io.github.resilience4j.micrometer.tagged.TaggedRateLimiterMetrics;
import io.github.resilience4j.micrometer.tagged.TaggedRetryMetrics;
import io.github.resilience4j.ratelimiter.RateLimiterRegistry;
import io.github.resilience4j.retry.RetryRegistry;

import io.github.primelib.primecodegenlib.java.feign.common.interceptor.AuthInterceptor;
import io.github.primelib.primecodegenlib.java.feign.resilience4j.Resilience4JCapability;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.function.Consumer;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Slf4j
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PrometheusHTTPFactory {
    private static final ObjectMapper MAPPER = JsonMapper.builder()
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
            .enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .propertyNamingStrategy(PropertyNamingStrategies.LOWER_CAMEL_CASE)
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
            .addModule(new JavaTimeModule())
            .addModule(new BlackbirdModule())
            .build();

    public static <T> T create(Consumer<PrometheusHTTPFactorySpec<T>> spec) {
        PrometheusHTTPFactorySpec<T> config = new PrometheusHTTPFactorySpec<>(spec);

        if (config.api().isInterface()) {
            return buildClient(spec);
        } else {
            try {
                PrometheusHTTPApi api = buildClient(s -> {
                    s.api(PrometheusHTTPApi.class);
                    s.applySpec(config);
                });
                return config.api().getConstructor(PrometheusHTTPApi.class).newInstance(api);
            } catch (Exception ex) {
                throw new IllegalArgumentException("api must have a constructor with one parameter of type PrometheusHTTPApi", ex);
            }
        }
    }

    public static PrometheusHTTPApi create() {
        return create(spec -> spec.api(PrometheusHTTPApi.class));
    }

    private static <T> T buildClient(Consumer<PrometheusHTTPFactorySpec<T>> spec) {
        PrometheusHTTPFactorySpec<T> config = new PrometheusHTTPFactorySpec<>(spec);

        // registries
        BulkheadRegistry bulkheadRegistry = BulkheadRegistry.ofDefaults();
        RateLimiterRegistry rateLimiterRegistry = RateLimiterRegistry.ofDefaults();
        CircuitBreakerRegistry circuitBreakerRegistry = CircuitBreakerRegistry.ofDefaults();
        RetryRegistry retryRegistry = RetryRegistry.ofDefaults();

        // decorators
        FeignDecorators decorators = FeignDecorators.builder()
                .withBulkhead(bulkheadRegistry.bulkhead(config.backendName()))
                .withRateLimiter(rateLimiterRegistry.rateLimiter(config.backendName()))
                .withCircuitBreaker(circuitBreakerRegistry.circuitBreaker(config.backendName()))
                .withRetry(retryRegistry.retry(config.backendName()))
                .build();

        // metrics
        TaggedBulkheadMetrics.ofBulkheadRegistry(bulkheadRegistry).bindTo(config.meterRegistry());
        TaggedRateLimiterMetrics.ofRateLimiterRegistry(rateLimiterRegistry).bindTo(config.meterRegistry());
        TaggedCircuitBreakerMetrics.ofCircuitBreakerRegistry(circuitBreakerRegistry).bindTo(config.meterRegistry());
        TaggedRetryMetrics.ofRetryRegistry(retryRegistry).bindTo(config.meterRegistry());

        // http client
        okhttp3.OkHttpClient.Builder clientBuilder = new okhttp3.OkHttpClient.Builder();
        if (config.proxy() != null && config.proxy().type() != Proxy.Type.DIRECT) {
            clientBuilder.proxy(new Proxy(config.proxy().type(), new InetSocketAddress(config.proxy().host(), config.proxy().port())));
            if (config.proxy().username() != null || config.proxy().password() != null) {
                clientBuilder.proxyAuthenticator((route, response) -> {
                    return response.request().newBuilder()
                            .header("Proxy-Authorization", Credentials.basic(config.proxy().username(), new String(config.proxy().password())))
                            .build();
                });
            }
        }

        // builder
        return Feign.builder()
                .client(new OkHttpClient(clientBuilder.build()))
                .encoder(new JacksonEncoder(MAPPER))
                .decoder(new JacksonDecoder(MAPPER))
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.valueOf(config.logLevel().toUpperCase()))
                .addCapability(new MicrometerCapability(config.meterRegistry()))
                .addCapability(new Resilience4JCapability(decorators))
                .requestInterceptor(new AuthInterceptor(config.auth()))
                .target(config.api(), config.baseUrl());
    }
}
