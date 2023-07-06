package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryDataResultMetric
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "__name__",
    "job",
    "instance"
})
@JsonTypeName("QueryData_result_metric")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryDataResultMetric {

    @JsonProperty("__name__")
    private String name;

    @JsonProperty("job")
    private String job;

    @JsonProperty("instance")
    private String instance;


}
