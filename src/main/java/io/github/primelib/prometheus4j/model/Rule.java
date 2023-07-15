package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Rule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "query",
    "labels",
    "annotations",
    "health",
    "state",
    "type",
    "duration",
    "alerts",
    "lastEvaluation",
    "evaluationTime"
})
@JsonTypeName("Rule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Rule {

    /**
     * Constructs a validated implementation of {@link Rule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Rule(Consumer<Rule> spec) {
        spec.accept(this);
    }

    /**
     * Rule name
     */
    @JsonProperty("name")
    protected String name;

    /**
     * PromQL expression
     */
    @JsonProperty("query")
    protected String query;

    @JsonProperty("labels")
    protected Map<String, String> labels = new HashMap<>();

    @JsonProperty("annotations")
    protected Map<String, String> annotations = new HashMap<>();

    /**
     * Rule health
     */
    @JsonProperty("health")
    protected HealthEnum health;

    @JsonProperty("state")
    protected AlertState state;

    /**
     * Rule type
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * duration in seconds
     */
    @JsonProperty("duration")
    protected Integer duration;

    /**
     * A list of active alerts
     */
    @JsonProperty("alerts")
    protected List<Alert> alerts;

    /**
     * Last time the rule was evaluated
     */
    @JsonProperty("lastEvaluation")
    protected String lastEvaluation;

    /**
     * Time it took to evaluate the rule
     */
    @JsonProperty("evaluationTime")
    protected BigDecimal evaluationTime;


    /**
     * Rule health
     */
    @AllArgsConstructor
    public enum HealthEnum {
        OK("ok");

        private final String value;
    }

    /**
     * Rule type
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ALERTING("alerting"),
        RECORDING("recording");

        private final String value;
    }

}
