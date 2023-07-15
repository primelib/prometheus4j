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
 * QueryData
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "result",
    "resultType"
})
@JsonTypeName("QueryData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryData {

    /**
     * Constructs a validated implementation of {@link QueryData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public QueryData(Consumer<QueryData> spec) {
        spec.accept(this);
    }

    @JsonProperty("result")
    protected QueryDataResult result;

    @JsonProperty("resultType")
    protected ResultTypeEnum resultType;


    @AllArgsConstructor
    public enum ResultTypeEnum {
        MATRIX("matrix"),
        VECTOR("vector"),
        SCALAR("scalar"),
        STRING("string");

        private final String value;
    }

}
