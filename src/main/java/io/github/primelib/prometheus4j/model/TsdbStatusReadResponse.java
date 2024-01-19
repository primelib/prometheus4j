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
 * TsdbStatusReadResponse
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
@JsonTypeName("TsdbStatusReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TsdbStatusReadResponse {

    @JsonProperty("status")
    protected String status;

    @JsonProperty("data")
    protected TsdbStatus data;

    /**
     * Constructs a validated instance of {@link TsdbStatusReadResponse}.
     *
     * @param spec the specification to process
     */
    public TsdbStatusReadResponse(Consumer<TsdbStatusReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TsdbStatusReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TsdbStatusReadResponse(Consumer)} instead.
     * @param status status
     * @param data data
     */
    @ApiStatus.Internal
    public TsdbStatusReadResponse(String status, TsdbStatus data) {
        this.status = status;
        this.data = data;
    }

}
