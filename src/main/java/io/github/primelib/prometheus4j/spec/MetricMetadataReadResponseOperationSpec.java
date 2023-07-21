package io.github.primelib.prometheus4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.prometheus4j.model.MetadataReadResponse;
import io.github.primelib.prometheus4j.model.MetricMetadata;
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
 * MetricMetadataReadResponseSpec
 * <p>
 * Specification for the MetricMetadataReadResponse operation.
 * <p>
 * Returns metric metadata
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link MetricMetadataReadResponseOperationSpec}.
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
     * Constructs a validated instance of {@link MetricMetadataReadResponseOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param limit                Maximum number of metrics to return.
     * @param metric               A metric name to filter metadata for. All metric metadata is retrieved if left empty.
     */
    @ApiStatus.Internal
    public MetricMetadataReadResponseOperationSpec(Integer limit, String metric) {
        this.limit = limit;
        this.metric = metric;

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
