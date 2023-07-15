package io.github.primelib.prometheus4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuntimeInfoResponseData
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "groups"
})
@JsonTypeName("RuntimeInfoResponse_data")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RuntimeInfoResponseData {

    /**
     * Constructs a validated implementation of {@link RuntimeInfoResponseData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RuntimeInfoResponseData(Consumer<RuntimeInfoResponseData> spec) {
        spec.accept(this);
    }

    @JsonProperty("groups")
    protected List<RuntimeInfo> groups;


}
