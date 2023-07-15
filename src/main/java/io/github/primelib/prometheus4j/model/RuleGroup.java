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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleGroup
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link RuleGroup}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RuleGroup(Consumer<RuleGroup> spec) {
        spec.accept(this);
    }

    @JsonProperty("evaluationTime")
    protected Double evaluationTime;

    @JsonProperty("file")
    protected String _file;

    @JsonProperty("interval")
    protected BigDecimal interval;

    @JsonProperty("lastEvaluation")
    protected String lastEvaluation;

    @JsonProperty("name")
    protected String name;

    /**
     * In order to preserve rule ordering, while exposing type (alerting or recording) specific properties, both alerting and recording rules are exposed in the same array.
     */
    @JsonProperty("rules")
    protected List<Object> rules;


}
