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
 * HeadStats
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
    protected Long chunkCount;

    @JsonProperty("maxTime")
    protected Long maxTime;

    @JsonProperty("minTime")
    protected Long minTime;

    @JsonProperty("numLabelPairs")
    protected Long numLabelPairs;

    @JsonProperty("numSeries")
    protected Integer numSeries;

    /**
     * Constructs a validated instance of {@link HeadStats}.
     *
     * @param spec the specification to process
     */
    public HeadStats(Consumer<HeadStats> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link HeadStats}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #HeadStats(Consumer)} instead.
     * @param chunkCount chunkCount
     * @param maxTime maxTime
     * @param minTime minTime
     * @param numLabelPairs numLabelPairs
     * @param numSeries numSeries
     */
    @ApiStatus.Internal
    public HeadStats(Long chunkCount, Long maxTime, Long minTime, Long numLabelPairs, Integer numSeries) {
        this.chunkCount = chunkCount;
        this.maxTime = maxTime;
        this.minTime = minTime;
        this.numLabelPairs = numLabelPairs;
        this.numSeries = numSeries;
    }

}
