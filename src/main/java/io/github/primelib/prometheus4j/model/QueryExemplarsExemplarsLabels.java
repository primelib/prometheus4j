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
 * QueryExemplarsExemplarsLabels
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
    "traceID"
})
@JsonTypeName("QueryExemplars_exemplars_labels")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplarsExemplarsLabels {

    @JsonProperty("traceID")
    protected String traceID;

    /**
     * Constructs a validated instance of {@link QueryExemplarsExemplarsLabels}.
     *
     * @param spec the specification to process
     */
    public QueryExemplarsExemplarsLabels(Consumer<QueryExemplarsExemplarsLabels> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link QueryExemplarsExemplarsLabels}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #QueryExemplarsExemplarsLabels(Consumer)} instead.
     * @param traceID traceID
     */
    @ApiStatus.Internal
    public QueryExemplarsExemplarsLabels(String traceID) {
        this.traceID = traceID;
    }

}
