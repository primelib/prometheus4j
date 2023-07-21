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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleGroup
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
    "evaluationTime",
    "file",
    "interval",
    "lastEvaluation",
    "name",
    "rules"
})
@JsonTypeName("RuleGroup")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RuleGroup {

    @JsonProperty("evaluationTime")
    protected Double evaluationTime;

    @JsonProperty("file")
    protected String _file;

    /**
     * Interval at which the rule group is evaluated.This is the number of seconds between evaluations.
     */
    @JsonProperty("interval")
    protected Integer interval;

    /**
     * Last time the rule group was evaluated.
     */
    @JsonProperty("lastEvaluation")
    protected String lastEvaluation;

    @JsonProperty("name")
    protected String name;

    /**
     * In order to preserve rule ordering, while exposing type (alerting or recording) specific properties, both alerting and recording rules are exposed in the same array.
     */
    @JsonProperty("rules")
    protected List<Rule> rules;

    /**
     * Constructs a validated instance of {@link RuleGroup}.
     *
     * @param spec the specification to process
     */
    public RuleGroup(Consumer<RuleGroup> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RuleGroup}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RuleGroup(Consumer)} instead.
     * @param evaluationTime var.name
     * @param _file var.name
     * @param interval Interval at which the rule group is evaluated.This is the number of seconds between evaluations.
     * @param lastEvaluation Last time the rule group was evaluated.
     * @param name var.name
     * @param rules In order to preserve rule ordering, while exposing type (alerting or recording) specific properties, both alerting and recording rules are exposed in the same array.
     */
    @ApiStatus.Internal
    public RuleGroup(Double evaluationTime, String _file, Integer interval, String lastEvaluation, String name, List<Rule> rules) {
        this.evaluationTime = evaluationTime;
        this._file = _file;
        this.interval = interval;
        this.lastEvaluation = lastEvaluation;
        this.name = name;
        this.rules = rules;
    }

}
