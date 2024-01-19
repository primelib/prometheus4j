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
 * LabelNamesReadResponse
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
@JsonTypeName("LabelNamesReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LabelNamesReadResponse {

    @JsonProperty("status")
    protected String status;

    /**
     * a list of string label names
     */
    @JsonProperty("data")
    protected List<String> data;

    /**
     * Constructs a validated instance of {@link LabelNamesReadResponse}.
     *
     * @param spec the specification to process
     */
    public LabelNamesReadResponse(Consumer<LabelNamesReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LabelNamesReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LabelNamesReadResponse(Consumer)} instead.
     * @param status status
     * @param data a list of string label names
     */
    @ApiStatus.Internal
    public LabelNamesReadResponse(String status, List<String> data) {
        this.status = status;
        this.data = data;
    }

}
