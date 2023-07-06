package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Snapshot
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "name"
})
@JsonTypeName("Snapshot")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Snapshot {

    @JsonProperty("name")
    private String name;


}
