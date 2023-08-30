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
 * TargetDiscovery
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
    "activeTargets",
    "droppedTargets"
})
@JsonTypeName("TargetDiscovery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TargetDiscovery {

    @JsonProperty("activeTargets")
    protected List<Target> activeTargets;

    @JsonProperty("droppedTargets")
    protected List<DroppedTarget> droppedTargets;

    /**
     * Constructs a validated instance of {@link TargetDiscovery}.
     *
     * @param spec the specification to process
     */
    public TargetDiscovery(Consumer<TargetDiscovery> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TargetDiscovery}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TargetDiscovery(Consumer)} instead.
     * @param activeTargets activeTargets
     * @param droppedTargets droppedTargets
     */
    @ApiStatus.Internal
    public TargetDiscovery(List<Target> activeTargets, List<DroppedTarget> droppedTargets) {
        this.activeTargets = activeTargets;
        this.droppedTargets = droppedTargets;
    }

}
