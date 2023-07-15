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
 * QueryExemplarsExemplars
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "labels",
    "values",
    "timestamp"
})
@JsonTypeName("QueryExemplars_exemplars")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplarsExemplars {

    /**
     * Constructs a validated implementation of {@link QueryExemplarsExemplars}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public QueryExemplarsExemplars(Consumer<QueryExemplarsExemplars> spec) {
        spec.accept(this);
    }

    @JsonProperty("labels")
    protected QueryExemplarsExemplarsLabels labels;

    @JsonProperty("values")
    protected String values;

    @JsonProperty("timestamp")
    protected String timestamp;


}
