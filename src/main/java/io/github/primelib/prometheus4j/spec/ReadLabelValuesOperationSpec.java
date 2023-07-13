package io.github.primelib.prometheus4j.spec;

import java.util.List;
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
 * ReadLabelValuesSpec
 * <p>
 * Specification for the ReadLabelValues operation.
 * <p>
 * Returns label values
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadLabelValuesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Label name.
     */
    @NotNull 
    private String labelName;

    /**
     * Start timestamp.
     */
    @NotNull 
    private String start;

    /**
     * End timestamp.
     */
    @Nullable 
    private String end;

    /**
     * Repeated series selector argument that selects the series from which to read the label values. 
     */
    @Nullable 
    private List<String> match;

    /**
     * Constructs a validated implementation of {@link ReadLabelValuesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadLabelValuesOperationSpec(Consumer<ReadLabelValuesOperationSpec> spec) {
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
        Objects.requireNonNull(labelName, "labelName is a required parameter!");
        Objects.requireNonNull(start, "start is a required parameter!");
    }

}
