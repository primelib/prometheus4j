package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PrometheusConfig
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "yaml"
})
@JsonTypeName("PrometheusConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PrometheusConfig {

    @JsonProperty("yaml")
    protected String yaml;

    /**
     * Constructs a validated instance of {@link PrometheusConfig}.
     *
     * @param spec the specification to process
     */
    public PrometheusConfig(Consumer<PrometheusConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PrometheusConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PrometheusConfig(Consumer)} instead.
     * @param yaml yaml
     */
    @ApiStatus.Internal
    public PrometheusConfig(String yaml) {
        this.yaml = yaml;
    }

}
