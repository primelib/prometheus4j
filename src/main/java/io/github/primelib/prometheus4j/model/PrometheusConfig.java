package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PrometheusConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "yaml"
})
@JsonTypeName("PrometheusConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PrometheusConfig {

    @JsonProperty("yaml")
    private String yaml;


}
