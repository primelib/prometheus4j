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
 * TsdbStatus
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
    "HeadStats",
    "LabelValueCountByLabelName",
    "MemoryInBytesByLabelName",
    "SeriesCountByLabelValuePair",
    "SeriesCountByMetricName"
})
@JsonTypeName("TsdbStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TsdbStatus {

    @JsonProperty("HeadStats")
    protected HeadStats headStats;

    /**
     * This will provide a list of the label names and their value count.
     */
    @JsonProperty("LabelValueCountByLabelName")
    protected List<Stat> labelValueCountByLabelName;

    /**
     * This will provide a list of the label names and memory used in bytes. Memory usage is calculated by adding the length of all values for a given label name.
     */
    @JsonProperty("MemoryInBytesByLabelName")
    protected List<Stat> memoryInBytesByLabelName;

    /**
     * This will provide a list of label value pairs and their series count.
     */
    @JsonProperty("SeriesCountByLabelValuePair")
    protected List<Stat> seriesCountByLabelValuePair;

    /**
     * This will provide a list of metrics names and their series count.
     */
    @JsonProperty("SeriesCountByMetricName")
    protected List<Stat> seriesCountByMetricName;

    /**
     * Constructs a validated instance of {@link TsdbStatus}.
     *
     * @param spec the specification to process
     */
    public TsdbStatus(Consumer<TsdbStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TsdbStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TsdbStatus(Consumer)} instead.
     * @param headStats headStats
     * @param labelValueCountByLabelName This will provide a list of the label names and their value count.
     * @param memoryInBytesByLabelName This will provide a list of the label names and memory used in bytes. Memory usage is calculated by adding the length of all values for a given label name.
     * @param seriesCountByLabelValuePair This will provide a list of label value pairs and their series count.
     * @param seriesCountByMetricName This will provide a list of metrics names and their series count.
     */
    @ApiStatus.Internal
    public TsdbStatus(HeadStats headStats, List<Stat> labelValueCountByLabelName, List<Stat> memoryInBytesByLabelName, List<Stat> seriesCountByLabelValuePair, List<Stat> seriesCountByMetricName) {
        this.headStats = headStats;
        this.labelValueCountByLabelName = labelValueCountByLabelName;
        this.memoryInBytesByLabelName = memoryInBytesByLabelName;
        this.seriesCountByLabelValuePair = seriesCountByLabelValuePair;
        this.seriesCountByMetricName = seriesCountByMetricName;
    }

}
