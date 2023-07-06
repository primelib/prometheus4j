package io.github.primelib.prometheus4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * EvaluateQueryRangeSpec
 * <p>
 * Specification for the EvaluateQueryRange operation.
 * <p>
 * Evaluates query over range of time.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EvaluateQueryRangeOperationSpec {

    /**
     * Prometheus expression query string. 
     */
    @NotNull 
    private String query;

    /**
     * Start timestamp. 
     */
    @Nullable 
    private String start;

    /**
     * End timestamp. 
     */
    @Nullable 
    private String end;

    /**
     * Query resolution step width in "duration" format or float number of seconds. 
     */
    @Nullable 
    private String step;

    /**
     * Evaluation timeout. Optional. Defaults to and is capped by the value of the "-query.timeout" flag. 
     */
    @Nullable 
    private String timeout;

    /**
     * Constructs a validated implementation of {@link EvaluateQueryRangeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EvaluateQueryRangeOperationSpec(Consumer<EvaluateQueryRangeOperationSpec> spec) {
        spec.accept(this);
        validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(query, "query is a required parameter!");
    }

}
