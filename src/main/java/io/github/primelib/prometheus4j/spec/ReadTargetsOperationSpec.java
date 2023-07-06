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
 * ReadTargetsSpec
 * <p>
 * Specification for the ReadTargets operation.
 * <p>
 * Returns current target discovery.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadTargetsOperationSpec {

    /**
     * The "state" query parameter allows the caller to filter by active or dropped targets, (e.g., "state=active", "state=dropped", "state=any"). 
     */
    @Nullable 
    private String state;

    /**
     * Constructs a validated implementation of {@link ReadTargetsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadTargetsOperationSpec(Consumer<ReadTargetsOperationSpec> spec) {
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
