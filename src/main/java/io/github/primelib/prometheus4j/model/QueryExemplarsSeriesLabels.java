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
 * QueryExemplarsSeriesLabels
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
    "__name__",
    "job",
    "instance",
    "service"
})
@JsonTypeName("QueryExemplars_seriesLabels")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplarsSeriesLabels {

    @JsonProperty("__name__")
    protected String _name;

    @JsonProperty("job")
    protected String job;

    @JsonProperty("instance")
    protected String instance;

    @JsonProperty("service")
    protected String service;

    /**
     * Constructs a validated instance of {@link QueryExemplarsSeriesLabels}.
     *
     * @param spec the specification to process
     */
    public QueryExemplarsSeriesLabels(Consumer<QueryExemplarsSeriesLabels> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link QueryExemplarsSeriesLabels}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #QueryExemplarsSeriesLabels(Consumer)} instead.
     * @param _name _name
     * @param job job
     * @param instance instance
     * @param service service
     */
    @ApiStatus.Internal
    public QueryExemplarsSeriesLabels(String _name, String job, String instance, String service) {
        this._name = _name;
        this.job = job;
        this.instance = instance;
        this.service = service;
    }

}
