package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TargetHealth
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("TargetHealth")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TargetHealth {

    /**
     * Constructs a validated instance of {@link TargetHealth}.
     *
     * @param spec the specification to process
     */
    public TargetHealth(Consumer<TargetHealth> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TargetHealth}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TargetHealth(Consumer)} instead.
     */
    @ApiStatus.Internal
    public TargetHealth() {
    }

}
