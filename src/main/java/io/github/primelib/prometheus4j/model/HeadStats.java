package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HeadStats
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "chunkCount",
    "maxTime",
    "minTime",
    "numLabelPairs",
    "numSeries"
})
@JsonTypeName("HeadStats")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HeadStats {

    @JsonProperty("chunkCount")
    private Long chunkCount;

    @JsonProperty("maxTime")
    private Long maxTime;

    @JsonProperty("minTime")
    private Long minTime;

    @JsonProperty("numLabelPairs")
    private Long numLabelPairs;

    @JsonProperty("numSeries")
    private Integer numSeries;


}
