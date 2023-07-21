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
 * Stat
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
    "name",
    "value"
})
@JsonTypeName("Stat")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Stat {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("value")
    protected Integer value;

    /**
     * Constructs a validated instance of {@link Stat}.
     *
     * @param spec the specification to process
     */
    public Stat(Consumer<Stat> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Stat}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Stat(Consumer)} instead.
     * @param name var.name
     * @param value var.name
     */
    @ApiStatus.Internal
    public Stat(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

}
