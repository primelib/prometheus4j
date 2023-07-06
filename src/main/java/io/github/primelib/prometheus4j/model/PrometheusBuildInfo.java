package io.github.primelib.prometheus4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PrometheusBuildInfo
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "branch",
    "buildDate",
    "buildUser",
    "goVersion",
    "revision",
    "version"
})
@JsonTypeName("PrometheusBuildInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PrometheusBuildInfo {

    @JsonProperty("branch")
    private String branch;

    @JsonProperty("buildDate")
    private String buildDate;

    @JsonProperty("buildUser")
    private String buildUser;

    @JsonProperty("goVersion")
    private String goVersion;

    @JsonProperty("revision")
    private String revision;

    @JsonProperty("version")
    private String version;


}
