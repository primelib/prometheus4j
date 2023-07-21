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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Rule
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
    protected Map<String, String> labels;

    @JsonProperty("annotations")
    protected Map<String, String> annotations;

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
     * Constructs a validated instance of {@link Rule}.
     *
     * @param spec the specification to process
     */
    public Rule(Consumer<Rule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Rule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Rule(Consumer)} instead.
     * @param name Rule name
     * @param query PromQL expression
     * @param labels var.name
     * @param annotations var.name
     * @param health Rule health
     * @param state var.name
     * @param type Rule type
     * @param duration duration in seconds
     * @param alerts A list of active alerts
     * @param lastEvaluation Last time the rule was evaluated
     * @param evaluationTime Time it took to evaluate the rule
     */
    @ApiStatus.Internal
    public Rule(String name, String query, Map<String, String> labels, Map<String, String> annotations, HealthEnum health, AlertState state, TypeEnum type, Integer duration, List<Alert> alerts, String lastEvaluation, BigDecimal evaluationTime) {
        this.name = name;
        this.query = query;
        this.labels = labels;
        this.annotations = annotations;
        this.health = health;
        this.state = state;
        this.type = type;
        this.duration = duration;
        this.alerts = alerts;
        this.lastEvaluation = lastEvaluation;
        this.evaluationTime = evaluationTime;
    }

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
