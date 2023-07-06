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
 * TargetDiscovery
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "activeTargets",
    "droppedTargets"
})
@JsonTypeName("TargetDiscovery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TargetDiscovery {

    @JsonProperty("activeTargets")
    private List<Target> activeTargets;

    @JsonProperty("droppedTargets")
    private List<DroppedTarget> droppedTargets;


}
