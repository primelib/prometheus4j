package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HeadStats
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link HeadStats}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public HeadStats(Consumer<HeadStats> spec) {
        spec.accept(this);
    }

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


}
