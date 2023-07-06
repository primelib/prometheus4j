package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryExemplars
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "seriesLabels",
    "exemplars"
})
@JsonTypeName("QueryExemplars")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplars {

    @JsonProperty("seriesLabels")
    private QueryExemplarsSeriesLabels seriesLabels;

    @JsonProperty("exemplars")
    private QueryExemplarsExemplars exemplars;


}
