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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetricMetadata
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

    /**
     * Constructs a validated instance of {@link MetricMetadata}.
     *
     * @param spec the specification to process
     */
    public MetricMetadata(Consumer<MetricMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MetricMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MetricMetadata(Consumer)} instead.
     * @param help var.name
     * @param metric var.name
     * @param target Labels is a sorted set of labels. Order has to be guaranteed upon instantiation.
     * @param type MetricType represents metric type values.
     * @param unit var.name
     */
    @ApiStatus.Internal
    public MetricMetadata(String help, String metric, List<Label> target, String type, String unit) {
        this.help = help;
        this.metric = metric;
        this.target = target;
        this.type = type;
        this.unit = unit;
    }

}
