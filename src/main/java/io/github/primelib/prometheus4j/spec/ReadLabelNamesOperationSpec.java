package io.github.primelib.prometheus4j.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ReadLabelNamesSpec
 * <p>
 * Specification for the ReadLabelNames operation.
 * <p>
 * Returns label names
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadLabelNamesOperationSpec {

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
     * Repeated series selector argument that selects the series from which to read the label values. Optional. 
     */
    @Nullable 
    private List<String> match;

    /**
     * Constructs a validated implementation of {@link ReadLabelNamesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadLabelNamesOperationSpec(Consumer<ReadLabelNamesOperationSpec> spec) {
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
