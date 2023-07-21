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
 * AlertReadResponseData
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
    "alerts"
})
@JsonTypeName("AlertReadResponse_data")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertReadResponseData {

    @JsonProperty("alerts")
    protected List<Alert> alerts;

    /**
     * Constructs a validated instance of {@link AlertReadResponseData}.
     *
     * @param spec the specification to process
     */
    public AlertReadResponseData(Consumer<AlertReadResponseData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AlertReadResponseData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AlertReadResponseData(Consumer)} instead.
     * @param alerts var.name
     */
    @ApiStatus.Internal
    public AlertReadResponseData(List<Alert> alerts) {
        this.alerts = alerts;
    }

}
