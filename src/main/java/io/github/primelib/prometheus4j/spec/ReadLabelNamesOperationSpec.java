package io.github.primelib.prometheus4j.spec;

import java.util.List;
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
 * ReadLabelNamesSpec
 * <p>
 * Specification for the ReadLabelNames operation.
 * <p>
 * Returns label names
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadLabelNamesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

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
     * Constructs a validated instance of {@link ReadLabelNamesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadLabelNamesOperationSpec(Consumer<ReadLabelNamesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ReadLabelNamesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param start                Start timestamp. 
     * @param end                  End timestamp. 
     * @param match                Repeated series selector argument that selects the series from which to read the label values. Optional. 
     */
    @ApiStatus.Internal
    public ReadLabelNamesOperationSpec(String start, String end, List<String> match) {
        this.start = start;
        this.end = end;
        this.match = match;

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
