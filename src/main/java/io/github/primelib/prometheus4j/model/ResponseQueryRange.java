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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResponseQueryRange
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
    "resultType",
    "result"
})
@JsonTypeName("responseQuery_range")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResponseQueryRange {

    @JsonProperty("resultType")
    protected String resultType;

    @JsonProperty("result")
    protected ResponseQueryRangeResult result;

    /**
     * Constructs a validated instance of {@link ResponseQueryRange}.
     *
     * @param spec the specification to process
     */
    public ResponseQueryRange(Consumer<ResponseQueryRange> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ResponseQueryRange}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ResponseQueryRange(Consumer)} instead.
     * @param resultType resultType
     * @param result result
     */
    @ApiStatus.Internal
    public ResponseQueryRange(String resultType, ResponseQueryRangeResult result) {
        this.resultType = resultType;
        this.result = result;
    }

}
