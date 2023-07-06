package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
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
@NoArgsConstructor
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
    private Map<String, List<String>> discoveredLabels = new HashMap<>();

    /**
     * Labels is a sorted set of labels. Order has to be guaranteed upon instantiation.
     */
    @JsonProperty("labels")
    private List<Label> labels;

    @JsonProperty("scrapePool")
    private String scrapePool;

    @JsonProperty("scrapeURL")
    private String scrapeURL;

    @JsonProperty("globalURL")
    private String globalURL;

    @JsonProperty("lastError")
    private String lastError;

    @JsonProperty("lastScrape")
    private String lastScrape;

    @JsonProperty("lastScrapeDuration")
    private BigDecimal lastScrapeDuration;

    /**
     * TargetHealth describes the health state of a target.
     */
    @JsonProperty("health")
    private String health;


}
