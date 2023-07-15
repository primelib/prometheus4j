package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PrometheusBuildInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link PrometheusBuildInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PrometheusBuildInfo(Consumer<PrometheusBuildInfo> spec) {
        spec.accept(this);
    }

    @JsonProperty("branch")
    protected String branch;

    @JsonProperty("buildDate")
    protected String buildDate;

    @JsonProperty("buildUser")
    protected String buildUser;

    @JsonProperty("goVersion")
    protected String goVersion;

    @JsonProperty("revision")
    protected String revision;

    @JsonProperty("version")
    protected String version;


}
