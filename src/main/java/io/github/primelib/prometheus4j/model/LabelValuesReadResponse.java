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
 * LabelValuesReadResponse
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
    "status",
    "data"
})
@JsonTypeName("LabelValuesReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LabelValuesReadResponse {

    @JsonProperty("status")
    protected String status;

    /**
     * a list of string label values
     */
    @JsonProperty("data")
    protected List<String> data;

    /**
     * Constructs a validated instance of {@link LabelValuesReadResponse}.
     *
     * @param spec the specification to process
     */
    public LabelValuesReadResponse(Consumer<LabelValuesReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LabelValuesReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LabelValuesReadResponse(Consumer)} instead.
     * @param status var.name
     * @param data a list of string label values
     */
    @ApiStatus.Internal
    public LabelValuesReadResponse(String status, List<String> data) {
        this.status = status;
        this.data = data;
    }

}
