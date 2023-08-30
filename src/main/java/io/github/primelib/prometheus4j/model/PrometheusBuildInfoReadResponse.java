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
 * PrometheusBuildInfoReadResponse
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
@JsonTypeName("PrometheusBuildInfoReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PrometheusBuildInfoReadResponse {

    @JsonProperty("status")
    protected String status;

    @JsonProperty("data")
    protected PrometheusBuildInfo data;

    /**
     * Constructs a validated instance of {@link PrometheusBuildInfoReadResponse}.
     *
     * @param spec the specification to process
     */
    public PrometheusBuildInfoReadResponse(Consumer<PrometheusBuildInfoReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PrometheusBuildInfoReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PrometheusBuildInfoReadResponse(Consumer)} instead.
     * @param status status
     * @param data data
     */
    @ApiStatus.Internal
    public PrometheusBuildInfoReadResponse(String status, PrometheusBuildInfo data) {
        this.status = status;
        this.data = data;
    }

}
