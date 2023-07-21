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
 * QueryExemplarsReadResponse
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
    "status",
    "data"
})
@JsonTypeName("QueryExemplarsReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QueryExemplarsReadResponse {

    @JsonProperty("status")
    protected String status;

    @JsonProperty("data")
    protected QueryExemplars data;

    /**
     * Constructs a validated instance of {@link QueryExemplarsReadResponse}.
     *
     * @param spec the specification to process
     */
    public QueryExemplarsReadResponse(Consumer<QueryExemplarsReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link QueryExemplarsReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #QueryExemplarsReadResponse(Consumer)} instead.
     * @param status var.name
     * @param data var.name
     */
    @ApiStatus.Internal
    public QueryExemplarsReadResponse(String status, QueryExemplars data) {
        this.status = status;
        this.data = data;
    }

}
