package io.github.primelib.prometheus4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.prometheus4j.model.MetadataReadResponse;
import io.github.primelib.prometheus4j.model.MetricMetadata;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * MetricMetadataReadResponseSpec
 * <p>
 * Specification for the MetricMetadataReadResponse operation.
 * <p>
 * Returns metric metadata
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MetricMetadataReadResponseOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Maximum number of metrics to return.
     */
    @NotNull 
    private Integer limit;

    /**
     * A metric name to filter metadata for. All metric metadata is retrieved if left empty.
     */
    @Nullable 
    private String metric;

    /**
     * Constructs a validated implementation of {@link MetricMetadataReadResponseOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MetricMetadataReadResponseOperationSpec(Consumer<MetricMetadataReadResponseOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(limit, "limit is a required parameter!");
    }

}
