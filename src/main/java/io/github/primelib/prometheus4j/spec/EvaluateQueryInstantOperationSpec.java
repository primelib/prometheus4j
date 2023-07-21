package io.github.primelib.prometheus4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
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
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EvaluateQueryInstantOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

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
     * Evaluation timeout. Optional. Defaults to and is capped by the value of the {@code }{@code -query.timeout}{@code } flag. 
     */
    @Nullable 
    private String timeout;

    /**
     * Constructs a validated instance of {@link EvaluateQueryInstantOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EvaluateQueryInstantOperationSpec(Consumer<EvaluateQueryInstantOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link EvaluateQueryInstantOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                Prometheus expression query string. 
     * @param time                 Evaluation timestamp. Optional. The current server time is used if the time parameter is omitted. 
     * @param timeout              Evaluation timeout. Optional. Defaults to and is capped by the value of the {@code }{@code -query.timeout}{@code } flag. 
     */
    @ApiStatus.Internal
    public EvaluateQueryInstantOperationSpec(String query, String time, String timeout) {
        this.query = query;
        this.time = time;
        this.timeout = timeout;

        if (VALIDATION_ENABLED)
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
