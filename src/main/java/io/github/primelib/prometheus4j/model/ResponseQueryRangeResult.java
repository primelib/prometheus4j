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
 * ResponseQueryRangeResult
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
    "values"
})
@JsonTypeName("responseQuery_range_result")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResponseQueryRangeResult {

    @JsonProperty("metric")
    protected QueryDataResultMetric metric;

    @JsonProperty("values")
    protected List<QueryDataResultValueInner> values;

    /**
     * Constructs a validated instance of {@link ResponseQueryRangeResult}.
     *
     * @param spec the specification to process
     */
    public ResponseQueryRangeResult(Consumer<ResponseQueryRangeResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ResponseQueryRangeResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ResponseQueryRangeResult(Consumer)} instead.
     * @param metric metric
     * @param values values
     */
    @ApiStatus.Internal
    public ResponseQueryRangeResult(QueryDataResultMetric metric, List<QueryDataResultValueInner> values) {
        this.metric = metric;
        this.values = values;
    }

}
