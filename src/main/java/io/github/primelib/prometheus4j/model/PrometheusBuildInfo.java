package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PrometheusBuildInfo
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    /**
     * Constructs a validated instance of {@link PrometheusBuildInfo}.
     *
     * @param spec the specification to process
     */
    public PrometheusBuildInfo(Consumer<PrometheusBuildInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PrometheusBuildInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PrometheusBuildInfo(Consumer)} instead.
     * @param branch branch
     * @param buildDate buildDate
     * @param buildUser buildUser
     * @param goVersion goVersion
     * @param revision revision
     * @param version version
     */
    @ApiStatus.Internal
    public PrometheusBuildInfo(String branch, String buildDate, String buildUser, String goVersion, String revision, String version) {
        this.branch = branch;
        this.buildDate = buildDate;
        this.buildUser = buildUser;
        this.goVersion = goVersion;
        this.revision = revision;
        this.version = version;
    }

}
