package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryExemplars
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "seriesLabels",
    "exemplars"
})
@JsonTypeName("QueryExemplars")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplars {

    @JsonProperty("seriesLabels")
    protected QueryExemplarsSeriesLabels seriesLabels;

    @JsonProperty("exemplars")
    protected QueryExemplarsExemplars exemplars;

    /**
     * Constructs a validated instance of {@link QueryExemplars}.
     *
     * @param spec the specification to process
     */
    public QueryExemplars(Consumer<QueryExemplars> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link QueryExemplars}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #QueryExemplars(Consumer)} instead.
     * @param seriesLabels var.name
     * @param exemplars var.name
     */
    @ApiStatus.Internal
    public QueryExemplars(QueryExemplarsSeriesLabels seriesLabels, QueryExemplarsExemplars exemplars) {
        this.seriesLabels = seriesLabels;
        this.exemplars = exemplars;
    }

}
