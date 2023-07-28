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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * QueryData
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
    "result",
    "resultType"
})
@JsonTypeName("QueryData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryData {

    @JsonProperty("result")
    protected QueryDataResult result;

    @JsonProperty("resultType")
    protected ResultTypeEnum resultType;

    /**
     * Constructs a validated instance of {@link QueryData}.
     *
     * @param spec the specification to process
     */
    public QueryData(Consumer<QueryData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link QueryData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #QueryData(Consumer)} instead.
     * @param result var.name
     * @param resultType var.name
     */
    @ApiStatus.Internal
    public QueryData(QueryDataResult result, ResultTypeEnum resultType) {
        this.result = result;
        this.resultType = resultType;
    }

    @AllArgsConstructor
    public enum ResultTypeEnum {
        MATRIX("matrix"),
        VECTOR("vector"),
        SCALAR("scalar"),
        STRING("string");

        private static final ResultTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ResultTypeEnum of(String input) {
            if (input != null) {
                for (ResultTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
