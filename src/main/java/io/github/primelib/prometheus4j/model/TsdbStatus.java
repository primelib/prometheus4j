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
 * TsdbStatus
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "HeadStats",
    "LabelValueCountByLabelName",
    "MemoryInBytesByLabelName",
    "SeriesCountByLabelValuePair",
    "SeriesCountByMetricName"
})
@JsonTypeName("tsdbStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TsdbStatus {

    /**
     * Constructs a validated implementation of {@link TsdbStatus}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TsdbStatus(Consumer<TsdbStatus> spec) {
        spec.accept(this);
    }

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


}
