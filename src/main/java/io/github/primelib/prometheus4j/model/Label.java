package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Label
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "name",
    "value"
})
@JsonTypeName("Label")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Label {

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private String value;


}
