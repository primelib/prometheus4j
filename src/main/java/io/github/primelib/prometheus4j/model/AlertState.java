package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AlertState
 * 
 *
 */
@JsonTypeName("AlertState")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum AlertState {
    FIRING("firing"),
    PENDING("pending"),
    INACTIVE("inactive");

    private final String value;
}
