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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetadataReadResponse
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
@JsonTypeName("MetadataReadResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MetadataReadResponse {

    @JsonProperty("status")
    protected String status;

    /**
     * a (key, object) map. {@code metric name}is an example key
     */
    @JsonProperty("data")
    protected Map<String, Metadata> data;

    /**
     * Constructs a validated instance of {@link MetadataReadResponse}.
     *
     * @param spec the specification to process
     */
    public MetadataReadResponse(Consumer<MetadataReadResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MetadataReadResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MetadataReadResponse(Consumer)} instead.
     * @param status var.name
     * @param data a (key, object) map. {@code metric name}is an example key
     */
    @ApiStatus.Internal
    public MetadataReadResponse(String status, Map<String, Metadata> data) {
        this.status = status;
        this.data = data;
    }

}
