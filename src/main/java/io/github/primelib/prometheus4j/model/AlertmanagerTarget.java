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
 * AlertmanagerTarget
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "url"
})
@JsonTypeName("AlertmanagerTarget")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertmanagerTarget {

    /**
     * Constructs a validated implementation of {@link AlertmanagerTarget}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AlertmanagerTarget(Consumer<AlertmanagerTarget> spec) {
        spec.accept(this);
    }

    @JsonProperty("url")
    protected String url;


}
