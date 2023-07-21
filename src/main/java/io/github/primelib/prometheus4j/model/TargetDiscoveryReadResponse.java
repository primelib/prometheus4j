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
 * TargetDiscoveryReadResponse
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
@JsonTypeName("TargetDiscoveryReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TargetDiscoveryReadResponse {

    @JsonProperty("status")
    protected String status;

    @JsonProperty("data")
    protected TargetDiscovery data;

    /**
     * Constructs a validated instance of {@link TargetDiscoveryReadResponse}.
     *
     * @param spec the specification to process
     */
    public TargetDiscoveryReadResponse(Consumer<TargetDiscoveryReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TargetDiscoveryReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TargetDiscoveryReadResponse(Consumer)} instead.
     * @param status var.name
     * @param data var.name
     */
    @ApiStatus.Internal
    public TargetDiscoveryReadResponse(String status, TargetDiscovery data) {
        this.status = status;
        this.data = data;
    }

}
