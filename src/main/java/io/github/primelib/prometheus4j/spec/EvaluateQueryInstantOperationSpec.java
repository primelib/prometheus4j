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
 * EvaluateQueryInstantSpec
 * <p>
 * Specification for the EvaluateQueryInstant operation.
 * <p>
 * Evaluates instant query
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EvaluateQueryInstantOperationSpec {

    /**
     * Prometheus expression query string. 
     */
    @NotNull 
    private String query;

    /**
     * Evaluation timestamp. Optional. The current server time is used if the time parameter is omitted. 
     */
    @Nullable 
    private String time;

    /**
     * Evaluation timeout. Optional. Defaults to and is capped by the value of the "-query.timeout" flag. 
     */
    @Nullable 
    private String timeout;

    /**
     * Constructs a validated implementation of {@link EvaluateQueryInstantOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EvaluateQueryInstantOperationSpec(Consumer<EvaluateQueryInstantOperationSpec> spec) {
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
