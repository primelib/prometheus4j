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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Alert
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
    "labels",
    "annotations",
    "state",
    "activeAt",
    "value"
})
@JsonTypeName("Alert")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Alert {

    @JsonProperty("labels")
    protected Map<String, String> labels;

    @JsonProperty("annotations")
    protected Map<String, String> annotations;

    @JsonProperty("state")
    protected AlertState state;

    @JsonProperty("activeAt")
    protected String activeAt;

    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link Alert}.
     *
     * @param spec the specification to process
     */
    public Alert(Consumer<Alert> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Alert}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Alert(Consumer)} instead.
     * @param labels var.name
     * @param annotations var.name
     * @param state var.name
     * @param activeAt var.name
     * @param value var.name
     */
    @ApiStatus.Internal
    public Alert(Map<String, String> labels, Map<String, String> annotations, AlertState state, String activeAt, String value) {
        this.labels = labels;
        this.annotations = annotations;
        this.state = state;
        this.activeAt = activeAt;
        this.value = value;
    }

}
