package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryData
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "result",
    "resultType"
})
@JsonTypeName("QueryData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryData {

    @JsonProperty("result")
    private QueryDataResult result;

    @JsonProperty("resultType")
    private ResultTypeEnum resultType;


    @AllArgsConstructor
    public enum ResultTypeEnum {
        MATRIX("matrix"),
        VECTOR("vector"),
        SCALAR("scalar"),
        STRING("string");

        private final String value;
    }

}
