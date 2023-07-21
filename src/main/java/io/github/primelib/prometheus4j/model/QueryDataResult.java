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
 * QueryDataResult
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
    "metric",
    "value"
})
@JsonTypeName("QueryData_result")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryDataResult {

    @JsonProperty("metric")
    protected QueryDataResultMetric metric;

    @JsonProperty("value")
    protected List<QueryDataResultValueInner> value;

    /**
     * Constructs a validated instance of {@link QueryDataResult}.
     *
     * @param spec the specification to process
     */
    public QueryDataResult(Consumer<QueryDataResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link QueryDataResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #QueryDataResult(Consumer)} instead.
     * @param metric var.name
     * @param value var.name
     */
    @ApiStatus.Internal
    public QueryDataResult(QueryDataResultMetric metric, List<QueryDataResultValueInner> value) {
        this.metric = metric;
        this.value = value;
    }

}
