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
 * ReadQueryExemplarsSpec
 * <p>
 * Specification for the ReadQueryExemplars operation.
 * <p>
 * Returns list of Exemplars
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadQueryExemplarsOperationSpec {
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
     * Constructs a validated instance of {@link ReadQueryExemplarsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadQueryExemplarsOperationSpec(Consumer<ReadQueryExemplarsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ReadQueryExemplarsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                Prometheus expression query string. 
     * @param start                Start timestamp. 
     * @param end                  End timestamp. 
     */
    @ApiStatus.Internal
    public ReadQueryExemplarsOperationSpec(String query, String start, String end) {
        this.query = query;
        this.start = start;
        this.end = end;

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
