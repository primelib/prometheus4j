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
 * MetadataReadResponse
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "status",
    "data"
})
@JsonTypeName("MetadataReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MetadataReadResponse {

    @JsonProperty("status")
    private String status;

    /**
     * a list of string label names
     */
    @JsonProperty("data")
    private List<String> data;


}
