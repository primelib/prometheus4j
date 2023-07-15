package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * QueryDataResultValueInner
 *
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("QueryData_result_value_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryDataResultValueInner {

    /**
     * Constructs a validated implementation of {@link QueryDataResultValueInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public QueryDataResultValueInner(Consumer<QueryDataResultValueInner> spec) {
        spec.accept(this);
    }


}
