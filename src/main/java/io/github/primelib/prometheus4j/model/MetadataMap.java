package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetadataMap
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "metricName"
})
@JsonTypeName("MetadataMap")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MetadataMap extends HashMap<String, Metadata> {

    @JsonProperty("metricName")
    private String metricName;


}
