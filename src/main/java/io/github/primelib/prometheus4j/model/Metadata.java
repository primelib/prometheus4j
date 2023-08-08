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
 * Metadata
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
    "help",
    "type",
    "unit"
})
@JsonTypeName("Metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Metadata {

    @JsonProperty("help")
    protected String help;

    /**
     * MetricType represents metric type values.
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("unit")
    protected String unit;

    /**
     * Constructs a validated instance of {@link Metadata}.
     *
     * @param spec the specification to process
     */
    public Metadata(Consumer<Metadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Metadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Metadata(Consumer)} instead.
     * @param help help
     * @param type MetricType represents metric type values.
     * @param unit unit
     */
    @ApiStatus.Internal
    public Metadata(String help, String type, String unit) {
        this.help = help;
        this.type = type;
        this.unit = unit;
    }

}
