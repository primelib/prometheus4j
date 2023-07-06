package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "help",
    "type",
    "unit"
})
@JsonTypeName("Metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Metadata {

    @JsonProperty("help")
    private String help;

    /**
     * MetricType represents metric type values.
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("unit")
    private String unit;


}
