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
 * LabelNamesReadResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "status",
    "data"
})
@JsonTypeName("LabelNamesReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LabelNamesReadResponse {

    /**
     * Constructs a validated implementation of {@link LabelNamesReadResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LabelNamesReadResponse(Consumer<LabelNamesReadResponse> spec) {
        spec.accept(this);
    }

    @JsonProperty("status")
    protected String status;

    /**
     * a list of string label names
     */
    @JsonProperty("data")
    protected List<String> data;


}
