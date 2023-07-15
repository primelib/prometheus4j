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
 * QueryExemplarsSeriesLabels
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "__name__",
    "job",
    "instance",
    "service"
})
@JsonTypeName("QueryExemplars_seriesLabels")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplarsSeriesLabels {

    /**
     * Constructs a validated implementation of {@link QueryExemplarsSeriesLabels}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public QueryExemplarsSeriesLabels(Consumer<QueryExemplarsSeriesLabels> spec) {
        spec.accept(this);
    }

    @JsonProperty("__name__")
    protected String name;

    @JsonProperty("job")
    protected String job;

    @JsonProperty("instance")
    protected String instance;

    @JsonProperty("service")
    protected String service;


}
