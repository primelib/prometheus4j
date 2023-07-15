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
 * Metadata
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "help",
    "type",
    "unit"
})
@JsonTypeName("Metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Metadata {

    /**
     * Constructs a validated implementation of {@link Metadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Metadata(Consumer<Metadata> spec) {
        spec.accept(this);
    }

    @JsonProperty("help")
    protected String help;

    /**
     * MetricType represents metric type values.
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("unit")
    protected String unit;


}
