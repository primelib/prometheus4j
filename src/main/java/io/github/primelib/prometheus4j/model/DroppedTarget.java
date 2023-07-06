package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DroppedTarget
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "discoveredLabels"
})
@JsonTypeName("DroppedTarget")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DroppedTarget {

    /**
     * Labels before any processing.
     */
    @JsonProperty("discoveredLabels")
    private Map<String, List<String>> discoveredLabels = new HashMap<>();


}
