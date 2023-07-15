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
 * RuntimeInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link RuntimeInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RuntimeInfo(Consumer<RuntimeInfo> spec) {
        spec.accept(this);
    }

    @JsonProperty("CWD")
    protected String CWD;

    @JsonProperty("GODEBUG")
    protected String GODEBUG;

    @JsonProperty("GOGC")
    protected String GOGC;

    @JsonProperty("GOMAXPROCS")
    protected Integer GOMAXPROCS;

    @JsonProperty("corruptionCount")
    protected Long corruptionCount;

    @JsonProperty("goroutineCount")
    protected Integer goroutineCount;

    @JsonProperty("lastConfigTime")
    protected String lastConfigTime;

    @JsonProperty("reloadConfigSuccess")
    protected Boolean reloadConfigSuccess;

    @JsonProperty("startTime")
    protected String startTime;

    @JsonProperty("storageRetention")
    protected String storageRetention;


}
