package io.github.primelib.prometheus4j.spec;

import java.util.List;
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
 * ReadSeriesSpec
 * <p>
 * Specification for the ReadSeries operation.
 * <p>
 * Returns time series
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadSeriesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Repeated series selector argument that selects the series to return. At least one {@code }{@code match[]}{@code } argument must be provided. 
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
     * Constructs a validated instance of {@link ReadSeriesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadSeriesOperationSpec(Consumer<ReadSeriesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ReadSeriesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param match                Repeated series selector argument that selects the series to return. At least one {@code }{@code match[]}{@code } argument must be provided. 
     * @param start                Start timestamp. Optional. 
     * @param end                  End timestamp. Optional. 
     */
    @ApiStatus.Internal
    public ReadSeriesOperationSpec(List<String> match, String start, String end) {
        this.match = match;
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
        Objects.requireNonNull(match, "match is a required parameter!");
    }
}
