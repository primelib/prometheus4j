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
 * MetricType
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("MetricType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MetricType {

    /**
     * Constructs a validated instance of {@link MetricType}.
     *
     * @param spec the specification to process
     */
    public MetricType(Consumer<MetricType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MetricType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MetricType(Consumer)} instead.
     */
    @ApiStatus.Internal
    public MetricType() {
    }

}
