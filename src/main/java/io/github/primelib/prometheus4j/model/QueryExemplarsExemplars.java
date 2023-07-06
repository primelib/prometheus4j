package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryExemplarsExemplars
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "labels",
    "values",
    "timestamp"
})
@JsonTypeName("QueryExemplars_exemplars")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplarsExemplars {

    @JsonProperty("labels")
    private QueryExemplarsExemplarsLabels labels;

    @JsonProperty("values")
    private String values;

    @JsonProperty("timestamp")
    private String timestamp;


}
