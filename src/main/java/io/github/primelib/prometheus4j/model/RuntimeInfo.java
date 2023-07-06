package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuntimeInfo
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "CWD",
    "GODEBUG",
    "GOGC",
    "GOMAXPROCS",
    "corruptionCount",
    "goroutineCount",
    "lastConfigTime",
    "reloadConfigSuccess",
    "startTime",
    "storageRetention"
})
@JsonTypeName("RuntimeInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RuntimeInfo {

    @JsonProperty("CWD")
    private String CWD;

    @JsonProperty("GODEBUG")
    private String GODEBUG;

    @JsonProperty("GOGC")
    private String GOGC;

    @JsonProperty("GOMAXPROCS")
    private Integer GOMAXPROCS;

    @JsonProperty("corruptionCount")
    private Long corruptionCount;

    @JsonProperty("goroutineCount")
    private Integer goroutineCount;

    @JsonProperty("lastConfigTime")
    private String lastConfigTime;

    @JsonProperty("reloadConfigSuccess")
    private Boolean reloadConfigSuccess;

    @JsonProperty("startTime")
    private String startTime;

    @JsonProperty("storageRetention")
    private String storageRetention;


}
