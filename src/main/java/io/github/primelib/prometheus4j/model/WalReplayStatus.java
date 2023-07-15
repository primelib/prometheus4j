package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WalReplayStatus
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "current",
    "max",
    "min"
})
@JsonTypeName("WalReplayStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WalReplayStatus {

    /**
     * Constructs a validated implementation of {@link WalReplayStatus}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WalReplayStatus(Consumer<WalReplayStatus> spec) {
        spec.accept(this);
    }

    @JsonProperty("current")
    protected Integer current;

    @JsonProperty("max")
    protected Integer max;

    @JsonProperty("min")
    protected Integer min;


}
