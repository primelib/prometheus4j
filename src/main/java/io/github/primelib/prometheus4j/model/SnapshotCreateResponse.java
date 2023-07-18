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
 * SnapshotCreateResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "status",
    "data"
})
@JsonTypeName("SnapshotCreateResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SnapshotCreateResponse {

    /**
     * Constructs a validated implementation of {@link SnapshotCreateResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SnapshotCreateResponse(Consumer<SnapshotCreateResponse> spec) {
        spec.accept(this);
    }

    @JsonProperty("status")
    protected String status;

    @JsonProperty("data")
    protected Snapshot data;


}
