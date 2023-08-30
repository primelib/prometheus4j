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
 * AlertReadResponse
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
@JsonTypeName("AlertReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertReadResponse {

    @JsonProperty("status")
    protected String status;

    @JsonProperty("data")
    protected AlertReadResponseData data;

    /**
     * Constructs a validated instance of {@link AlertReadResponse}.
     *
     * @param spec the specification to process
     */
    public AlertReadResponse(Consumer<AlertReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AlertReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AlertReadResponse(Consumer)} instead.
     * @param status status
     * @param data data
     */
    @ApiStatus.Internal
    public AlertReadResponse(String status, AlertReadResponseData data) {
        this.status = status;
        this.data = data;
    }

}
