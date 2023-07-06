package io.github.primelib.prometheus4j.spec;

import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ReadServerBuildInfoSpec
 * <p>
 * Specification for the ReadServerBuildInfo operation.
 * <p>
 * Returns build information
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadServerBuildInfoOperationSpec {

    /**
     * Constructs a validated implementation of {@link ReadServerBuildInfoOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadServerBuildInfoOperationSpec(Consumer<ReadServerBuildInfoOperationSpec> spec) {
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
