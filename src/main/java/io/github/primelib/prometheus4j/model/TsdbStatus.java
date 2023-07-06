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
 * TsdbStatus
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @JsonProperty("HeadStats")
    private HeadStats headStats;

    /**
     * This will provide a list of the label names and their value count.
     */
    @JsonProperty("LabelValueCountByLabelName")
    private List<Stat> labelValueCountByLabelName;

    /**
     * This will provide a list of the label names and memory used in bytes. Memory usage is calculated by adding the length of all values for a given label name.
     */
    @JsonProperty("MemoryInBytesByLabelName")
    private List<Stat> memoryInBytesByLabelName;

    /**
     * This will provide a list of label value pairs and their series count.
     */
    @JsonProperty("SeriesCountByLabelValuePair")
    private List<Stat> seriesCountByLabelValuePair;

    /**
     * This will provide a list of metrics names and their series count.
     */
    @JsonProperty("SeriesCountByMetricName")
    private List<Stat> seriesCountByMetricName;


}
