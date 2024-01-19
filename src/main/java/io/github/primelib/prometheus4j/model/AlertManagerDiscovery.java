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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlertManagerDiscovery
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
    "activeAlertmanagers",
    "droppedAlertmanagers"
})
@JsonTypeName("AlertManagerDiscovery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertManagerDiscovery {

    @JsonProperty("activeAlertmanagers")
    protected List<AlertmanagerTarget> activeAlertmanagers;

    @JsonProperty("droppedAlertmanagers")
    protected List<AlertmanagerTarget> droppedAlertmanagers;

    /**
     * Constructs a validated instance of {@link AlertManagerDiscovery}.
     *
     * @param spec the specification to process
     */
    public AlertManagerDiscovery(Consumer<AlertManagerDiscovery> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AlertManagerDiscovery}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AlertManagerDiscovery(Consumer)} instead.
     * @param activeAlertmanagers activeAlertmanagers
     * @param droppedAlertmanagers droppedAlertmanagers
     */
    @ApiStatus.Internal
    public AlertManagerDiscovery(List<AlertmanagerTarget> activeAlertmanagers, List<AlertmanagerTarget> droppedAlertmanagers) {
        this.activeAlertmanagers = activeAlertmanagers;
        this.droppedAlertmanagers = droppedAlertmanagers;
    }

}
