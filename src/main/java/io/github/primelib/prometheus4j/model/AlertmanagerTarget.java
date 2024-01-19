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
 * AlertmanagerTarget
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
    "url"
})
@JsonTypeName("AlertmanagerTarget")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertmanagerTarget {

    @JsonProperty("url")
    protected String url;

    /**
     * Constructs a validated instance of {@link AlertmanagerTarget}.
     *
     * @param spec the specification to process
     */
    public AlertmanagerTarget(Consumer<AlertmanagerTarget> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AlertmanagerTarget}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AlertmanagerTarget(Consumer)} instead.
     * @param url url
     */
    @ApiStatus.Internal
    public AlertmanagerTarget(String url) {
        this.url = url;
    }

}
