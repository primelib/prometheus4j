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
 * DeleteSeriesSpec
 * <p>
 * Specification for the DeleteSeries operation.
 * <p>
 * Deletes selected data
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteSeriesOperationSpec {

    /**
     * Repeated label matcher argument that selects the series to delete. At least one match[] argument must be provided. 
     */
    @NotNull 
    private List<String> match;

    /**
     * Start timestamp. Optional and defaults to minimum possible time.
     */
    @Nullable 
    private String start;

    /**
     * End timestamp. Optional and defaults to maximum possible time.
     * Not mentioning both start and end times would clear all the data for the matched series in the database. 
     */
    @Nullable 
    private String end;

    /**
     * Constructs a validated implementation of {@link DeleteSeriesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteSeriesOperationSpec(Consumer<DeleteSeriesOperationSpec> spec) {
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
