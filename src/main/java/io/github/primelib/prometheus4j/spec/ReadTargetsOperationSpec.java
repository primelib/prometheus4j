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
 * ReadTargetsSpec
 * <p>
 * Specification for the ReadTargets operation.
 * <p>
 * Returns current target discovery.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReadTargetsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The {@code }{@code state}{@code } query parameter allows the caller to filter by active or dropped targets, (e.g., {@code }{@code state=active}{@code }, {@code }{@code state=dropped}{@code }, {@code }{@code state=any}{@code }). 
     */
    @Nullable 
    private String state;

    /**
     * Constructs a validated instance of {@link ReadTargetsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReadTargetsOperationSpec(Consumer<ReadTargetsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ReadTargetsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param state                The {@code }{@code state}{@code } query parameter allows the caller to filter by active or dropped targets, (e.g., {@code }{@code state=active}{@code }, {@code }{@code state=dropped}{@code }, {@code }{@code state=any}{@code }). 
     */
    @ApiStatus.Internal
    public ReadTargetsOperationSpec(String state) {
        this.state = state;

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
