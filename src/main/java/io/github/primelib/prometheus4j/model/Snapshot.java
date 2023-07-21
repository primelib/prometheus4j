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
 * Snapshot
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
    "name"
})
@JsonTypeName("Snapshot")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Snapshot {

    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link Snapshot}.
     *
     * @param spec the specification to process
     */
    public Snapshot(Consumer<Snapshot> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Snapshot}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Snapshot(Consumer)} instead.
     * @param name var.name
     */
    @ApiStatus.Internal
    public Snapshot(String name) {
        this.name = name;
    }

}
