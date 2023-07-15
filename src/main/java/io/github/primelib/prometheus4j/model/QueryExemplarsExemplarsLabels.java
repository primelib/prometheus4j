package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryExemplarsExemplarsLabels
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "traceID"
})
@JsonTypeName("QueryExemplars_exemplars_labels")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplarsExemplarsLabels {

    /**
     * Constructs a validated implementation of {@link QueryExemplarsExemplarsLabels}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public QueryExemplarsExemplarsLabels(Consumer<QueryExemplarsExemplarsLabels> spec) {
        spec.accept(this);
    }

    @JsonProperty("traceID")
    protected String traceID;


}
