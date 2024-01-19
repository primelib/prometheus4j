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
 * WalReplayStatusReadResponse
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
@JsonTypeName("WalReplayStatusReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WalReplayStatusReadResponse {

    @JsonProperty("status")
    protected String status;

    @JsonProperty("data")
    protected WalReplayStatus data;

    /**
     * Constructs a validated instance of {@link WalReplayStatusReadResponse}.
     *
     * @param spec the specification to process
     */
    public WalReplayStatusReadResponse(Consumer<WalReplayStatusReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WalReplayStatusReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WalReplayStatusReadResponse(Consumer)} instead.
     * @param status status
     * @param data data
     */
    @ApiStatus.Internal
    public WalReplayStatusReadResponse(String status, WalReplayStatus data) {
        this.status = status;
        this.data = data;
    }

}
