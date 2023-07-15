package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link MetricMetadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MetricMetadata(Consumer<MetricMetadata> spec) {
        spec.accept(this);
    }

    @JsonProperty("help")
    protected String help;

    @JsonProperty("metric")
    protected String metric;

    /**
     * Labels is a sorted set of labels. Order has to be guaranteed upon instantiation.
     */
    @JsonProperty("target")
    protected List<Label> target;

    /**
     * MetricType represents metric type values.
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("unit")
    protected String unit;


}
