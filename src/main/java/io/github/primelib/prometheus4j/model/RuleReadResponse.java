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
 * RuleReadResponse
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
@JsonTypeName("RuleReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RuleReadResponse {

    @JsonProperty("status")
    protected String status;

    @JsonProperty("data")
    protected RuleReadResponseData data;

    /**
     * Constructs a validated instance of {@link RuleReadResponse}.
     *
     * @param spec the specification to process
     */
    public RuleReadResponse(Consumer<RuleReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RuleReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RuleReadResponse(Consumer)} instead.
     * @param status var.name
     * @param data var.name
     */
    @ApiStatus.Internal
    public RuleReadResponse(String status, RuleReadResponseData data) {
        this.status = status;
        this.data = data;
    }

}
