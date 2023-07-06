package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryExemplarsSeriesLabels
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "__name__",
    "job",
    "instance",
    "service"
})
@JsonTypeName("QueryExemplars_seriesLabels")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplarsSeriesLabels {

    @JsonProperty("__name__")
    private String name;

    @JsonProperty("job")
    private String job;

    @JsonProperty("instance")
    private String instance;

    @JsonProperty("service")
    private String service;


}
