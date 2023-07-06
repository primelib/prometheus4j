package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlertManagerDiscovery
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "activeAlertmanagers",
    "droppedAlertmanagers"
})
@JsonTypeName("AlertManagerDiscovery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertManagerDiscovery {

    @JsonProperty("activeAlertmanagers")
    private List<AlertmanagerTarget> activeAlertmanagers;

    @JsonProperty("droppedAlertmanagers")
    private List<AlertmanagerTarget> droppedAlertmanagers;


}
