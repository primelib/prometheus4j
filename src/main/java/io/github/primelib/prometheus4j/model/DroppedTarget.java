package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DroppedTarget
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "discoveredLabels"
})
@JsonTypeName("DroppedTarget")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DroppedTarget {

    /**
     * Constructs a validated implementation of {@link DroppedTarget}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DroppedTarget(Consumer<DroppedTarget> spec) {
        spec.accept(this);
    }

    /**
     * Labels before any processing.
     */
    @JsonProperty("discoveredLabels")
    protected Map<String, List<String>> discoveredLabels = new HashMap<>();


}
