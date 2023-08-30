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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DroppedTarget
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
    "discoveredLabels"
})
@JsonTypeName("DroppedTarget")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DroppedTarget {

    /**
     * Labels before any processing.
     */
    @JsonProperty("discoveredLabels")
    protected Map<String, List<String>> discoveredLabels;

    /**
     * Constructs a validated instance of {@link DroppedTarget}.
     *
     * @param spec the specification to process
     */
    public DroppedTarget(Consumer<DroppedTarget> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DroppedTarget}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DroppedTarget(Consumer)} instead.
     * @param discoveredLabels Labels before any processing.
     */
    @ApiStatus.Internal
    public DroppedTarget(Map<String, List<String>> discoveredLabels) {
        this.discoveredLabels = discoveredLabels;
    }

}
