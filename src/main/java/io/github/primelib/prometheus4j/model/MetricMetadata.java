package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetricMetadata
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "help",
    "metric",
    "target",
    "type",
    "unit"
})
@JsonTypeName("MetricMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MetricMetadata {

    @JsonProperty("help")
    private String help;

    @JsonProperty("metric")
    private String metric;

    /**
     * Labels is a sorted set of labels. Order has to be guaranteed upon instantiation.
     */
    @JsonProperty("target")
    private List<Label> target;

    /**
     * MetricType represents metric type values.
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("unit")
    private String unit;


}
