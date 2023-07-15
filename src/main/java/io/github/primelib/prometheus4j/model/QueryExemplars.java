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
 * QueryExemplars
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "seriesLabels",
    "exemplars"
})
@JsonTypeName("QueryExemplars")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplars {

    /**
     * Constructs a validated implementation of {@link QueryExemplars}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public QueryExemplars(Consumer<QueryExemplars> spec) {
        spec.accept(this);
    }

    @JsonProperty("seriesLabels")
    protected QueryExemplarsSeriesLabels seriesLabels;

    @JsonProperty("exemplars")
    protected QueryExemplarsExemplars exemplars;


}
