package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryDataResultMetric
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "__name__",
    "job",
    "instance"
})
@JsonTypeName("QueryData_result_metric")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryDataResultMetric {

    /**
     * Constructs a validated implementation of {@link QueryDataResultMetric}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public QueryDataResultMetric(Consumer<QueryDataResultMetric> spec) {
        spec.accept(this);
    }

    @JsonProperty("__name__")
    protected String name;

    @JsonProperty("job")
    protected String job;

    @JsonProperty("instance")
    protected String instance;


}
