package io.github.primelib.prometheus4j.spec;

import org.jetbrains.annotations.ApiStatus;
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
 * ReadTargetMetadataSpec
 * <p>
 * Specification for the ReadTargetMetadata operation.
 * <p>
 * Returns target metadata
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadTargetMetadataOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Label selectors that match targets by their label sets. All targets are selected if left empty. 
     */
    @Nullable 
    private String matchTarget;

    /**
     * A metric name to retrieve metadata for. All metric metadata is retrieved if left empty. 
     */
    @Nullable 
    private String metric;

    /**
     * Maximum number of targets to match. 
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link ReadTargetMetadataOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadTargetMetadataOperationSpec(Consumer<ReadTargetMetadataOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ReadTargetMetadataOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param matchTarget          Label selectors that match targets by their label sets. All targets are selected if left empty. 
     * @param metric               A metric name to retrieve metadata for. All metric metadata is retrieved if left empty. 
     * @param limit                Maximum number of targets to match. 
     */
    @ApiStatus.Internal
    public ReadTargetMetadataOperationSpec(String matchTarget, String metric, Integer limit) {
        this.matchTarget = matchTarget;
        this.metric = metric;
        this.limit = limit;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
