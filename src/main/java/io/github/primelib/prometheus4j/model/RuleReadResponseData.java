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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleReadResponseData
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
    "groups"
})
@JsonTypeName("RuleReadResponse_data")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RuleReadResponseData {

    @JsonProperty("groups")
    protected List<RuleGroup> groups;

    /**
     * Constructs a validated instance of {@link RuleReadResponseData}.
     *
     * @param spec the specification to process
     */
    public RuleReadResponseData(Consumer<RuleReadResponseData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RuleReadResponseData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RuleReadResponseData(Consumer)} instead.
     * @param groups var.name
     */
    @ApiStatus.Internal
    public RuleReadResponseData(List<RuleGroup> groups) {
        this.groups = groups;
    }

}
