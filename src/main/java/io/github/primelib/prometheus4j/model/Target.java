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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Target
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
     * Labels before any processing.
     */
    @JsonProperty("discoveredLabels")
    protected Map<String, List<String>> discoveredLabels;

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

    /**
     * Constructs a validated instance of {@link Target}.
     *
     * @param spec the specification to process
     */
    public Target(Consumer<Target> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Target}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Target(Consumer)} instead.
     * @param discoveredLabels Labels before any processing.
     * @param labels Labels is a sorted set of labels. Order has to be guaranteed upon instantiation.
     * @param scrapePool scrapePool
     * @param scrapeURL scrapeURL
     * @param globalURL globalURL
     * @param lastError lastError
     * @param lastScrape lastScrape
     * @param lastScrapeDuration lastScrapeDuration
     * @param health TargetHealth describes the health state of a target.
     */
    @ApiStatus.Internal
    public Target(Map<String, List<String>> discoveredLabels, List<Label> labels, String scrapePool, String scrapeURL, String globalURL, String lastError, String lastScrape, Double lastScrapeDuration, String health) {
        this.discoveredLabels = discoveredLabels;
        this.labels = labels;
        this.scrapePool = scrapePool;
        this.scrapeURL = scrapeURL;
        this.globalURL = globalURL;
        this.lastError = lastError;
        this.lastScrape = lastScrape;
        this.lastScrapeDuration = lastScrapeDuration;
        this.health = health;
    }

}
