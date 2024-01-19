package io.github.primelib.prometheus4j.spec;

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
 * ReadRulesSpec
 * <p>
 * Specification for the ReadRules operation.
 * <p>
 * Returns currently loaded rules
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadRulesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Return only the alerting rules (e.g. {@code }{@code type=alert}{@code }) or the recording rules (e.g. {@code }{@code type=record}{@code }). When the parameter is absent or empty, no filtering is done. 
     */
    @Nullable 
    private String type;

    /**
     * Constructs a validated instance of {@link ReadRulesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadRulesOperationSpec(Consumer<ReadRulesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ReadRulesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param type                 Return only the alerting rules (e.g. {@code }{@code type=alert}{@code }) or the recording rules (e.g. {@code }{@code type=record}{@code }). When the parameter is absent or empty, no filtering is done. 
     */
    @ApiStatus.Internal
    public ReadRulesOperationSpec(String type) {
        this.type = type;

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
