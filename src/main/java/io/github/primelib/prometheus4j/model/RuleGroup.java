package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private Double evaluationTime;

    @JsonProperty("file")
    private String _file;

    @JsonProperty("interval")
    private BigDecimal interval;

    @JsonProperty("lastEvaluation")
    private String lastEvaluation;

    @JsonProperty("name")
    private String name;

    /**
     * In order to preserve rule ordering, while exposing type (alerting or recording) specific properties, both alerting and recording rules are exposed in the same array.
     */
    @JsonProperty("rules")
    private List<Object> rules;


}
