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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Alert
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "labels",
    "annotations",
    "state",
    "activeAt",
    "value"
})
@JsonTypeName("Alert")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Alert {

    /**
     * Constructs a validated implementation of {@link Alert}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Alert(Consumer<Alert> spec) {
        spec.accept(this);
    }

    @JsonProperty("labels")
    protected Map<String, String> labels = new HashMap<>();

    @JsonProperty("annotations")
    protected Map<String, String> annotations = new HashMap<>();

    @JsonProperty("state")
    protected AlertState state;

    @JsonProperty("activeAt")
    protected String activeAt;

    @JsonProperty("value")
    protected String value;


}
