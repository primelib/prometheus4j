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
 * WalReplayStatus
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
    "current",
    "max",
    "min"
})
@JsonTypeName("WalReplayStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WalReplayStatus {

    @JsonProperty("current")
    protected Integer current;

    @JsonProperty("max")
    protected Integer max;

    @JsonProperty("min")
    protected Integer min;

    /**
     * Constructs a validated instance of {@link WalReplayStatus}.
     *
     * @param spec the specification to process
     */
    public WalReplayStatus(Consumer<WalReplayStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WalReplayStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WalReplayStatus(Consumer)} instead.
     * @param current var.name
     * @param max var.name
     * @param min var.name
     */
    @ApiStatus.Internal
    public WalReplayStatus(Integer current, Integer max, Integer min) {
        this.current = current;
        this.max = max;
        this.min = min;
    }

}
