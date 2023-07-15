package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Target
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "discoveredLabels",
    "labels",
    "scrapePool",
    "scrapeURL",
    "globalURL",
    "lastError",
    "lastScrape",
    "lastScrapeDuration",
    "health"
})
@JsonTypeName("Target")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Target {

    /**
     * Constructs a validated implementation of {@link Target}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Target(Consumer<Target> spec) {
        spec.accept(this);
    }

    /**
     * Labels before any processing.
     */
    @JsonProperty("discoveredLabels")
    protected Map<String, List<String>> discoveredLabels = new HashMap<>();

    /**
     * Labels is a sorted set of labels. Order has to be guaranteed upon instantiation.
     */
    @JsonProperty("labels")
    protected List<Label> labels;

    @JsonProperty("scrapePool")
    protected String scrapePool;

    @JsonProperty("scrapeURL")
    protected String scrapeURL;

    @JsonProperty("globalURL")
    protected String globalURL;

    @JsonProperty("lastError")
    protected String lastError;

    @JsonProperty("lastScrape")
    protected String lastScrape;

    @JsonProperty("lastScrapeDuration")
    protected Double lastScrapeDuration;

    /**
     * TargetHealth describes the health state of a target.
     */
    @JsonProperty("health")
    protected String health;


}
