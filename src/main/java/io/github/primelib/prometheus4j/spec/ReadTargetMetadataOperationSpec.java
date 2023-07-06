package io.github.primelib.prometheus4j.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadTargetMetadataOperationSpec {

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
     * Constructs a validated implementation of {@link ReadTargetMetadataOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadTargetMetadataOperationSpec(Consumer<ReadTargetMetadataOperationSpec> spec) {
        spec.accept(this);
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
