package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResponseQueryRangeResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "metric",
    "values"
})
@JsonTypeName("responseQuery_range_result")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResponseQueryRangeResult {

    /**
     * Constructs a validated implementation of {@link ResponseQueryRangeResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ResponseQueryRangeResult(Consumer<ResponseQueryRangeResult> spec) {
        spec.accept(this);
    }

    @JsonProperty("metric")
    protected QueryDataResultMetric metric;

    @JsonProperty("values")
    protected List<QueryDataResultValueInner> values;


}
