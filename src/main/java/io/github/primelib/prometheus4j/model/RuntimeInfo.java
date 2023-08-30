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
 * RuntimeInfo
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

    /**
     * Constructs a validated instance of {@link RuntimeInfo}.
     *
     * @param spec the specification to process
     */
    public RuntimeInfo(Consumer<RuntimeInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RuntimeInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RuntimeInfo(Consumer)} instead.
     * @param CWD CWD
     * @param GODEBUG GODEBUG
     * @param GOGC GOGC
     * @param GOMAXPROCS GOMAXPROCS
     * @param corruptionCount corruptionCount
     * @param goroutineCount goroutineCount
     * @param lastConfigTime lastConfigTime
     * @param reloadConfigSuccess reloadConfigSuccess
     * @param startTime startTime
     * @param storageRetention storageRetention
     */
    @ApiStatus.Internal
    public RuntimeInfo(String CWD, String GODEBUG, String GOGC, Integer GOMAXPROCS, Long corruptionCount, Integer goroutineCount, String lastConfigTime, Boolean reloadConfigSuccess, String startTime, String storageRetention) {
        this.CWD = CWD;
        this.GODEBUG = GODEBUG;
        this.GOGC = GOGC;
        this.GOMAXPROCS = GOMAXPROCS;
        this.corruptionCount = corruptionCount;
        this.goroutineCount = goroutineCount;
        this.lastConfigTime = lastConfigTime;
        this.reloadConfigSuccess = reloadConfigSuccess;
        this.startTime = startTime;
        this.storageRetention = storageRetention;
    }

}
