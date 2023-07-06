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
 * Alert
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * Labels is a sorted set of labels. Order has to be guaranteed upon instantiation.
     */
    @JsonProperty("labels")
    private List<Label> labels;

    /**
     * Labels is a sorted set of labels. Order has to be guaranteed upon instantiation.
     */
    @JsonProperty("annotations")
    private List<Label> annotations;

    @JsonProperty("state")
    private String state;

    @JsonProperty("activeAt")
    private String activeAt;

    @JsonProperty("value")
    private String value;


}
