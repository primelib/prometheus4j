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
 * TargetDiscovery
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "activeTargets",
    "droppedTargets"
})
@JsonTypeName("TargetDiscovery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TargetDiscovery {

    /**
     * Constructs a validated implementation of {@link TargetDiscovery}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TargetDiscovery(Consumer<TargetDiscovery> spec) {
        spec.accept(this);
    }

    @JsonProperty("activeTargets")
    protected List<Target> activeTargets;

    @JsonProperty("droppedTargets")
    protected List<DroppedTarget> droppedTargets;


}
