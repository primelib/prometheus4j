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
 * ReadRulesSpec
 * <p>
 * Specification for the ReadRules operation.
 * <p>
 * Returns currently loaded rules
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadRulesOperationSpec {

    /**
     * Return only the alerting rules (e.g. "type=alert") or the recording rules (e.g. "type=record"). When the parameter is absent or empty, no filtering is done. 
     */
    @Nullable 
    private String type;

    /**
     * Constructs a validated implementation of {@link ReadRulesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadRulesOperationSpec(Consumer<ReadRulesOperationSpec> spec) {
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
