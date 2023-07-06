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
 * ReadSeriesSpec
 * <p>
 * Specification for the ReadSeries operation.
 * <p>
 * Returns time series
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadSeriesOperationSpec {

    /**
     * Repeated series selector argument that selects the series to return. At least one "match[]" argument must be provided. 
     */
    @NotNull 
    private List<String> match;

    /**
     * Start timestamp. Optional. 
     */
    @Nullable 
    private String start;

    /**
     * End timestamp. Optional. 
     */
    @Nullable 
    private String end;

    /**
     * Constructs a validated implementation of {@link ReadSeriesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadSeriesOperationSpec(Consumer<ReadSeriesOperationSpec> spec) {
        spec.accept(this);
        validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(match, "match is a required parameter!");
    }

}
