package io.github.primelib.prometheus4j.auth;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class BasicAuthSpec implements AuthMethod {
    /**
     * key of the property that holds the API key (header key or query param key)
     */
    @NotNull
    private String propertyKey = "Authorization";

    /**
     * template for the basic auth value, use {base64} as placeholder for the value
     */
    @NotNull
    private String valueTemplate = "Basic {base64}";

    /**
     * username
     */
    @Nullable
    private String username;

    /**
     * password
     */
    @Nullable
    private String password;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.PUBLIC)
    private Map<String, String> headerMap = null;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.PUBLIC)
    private Map<String, String> queryMap = null;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.PUBLIC)
    private Map<String, String> cookieMap = null;

    /**
     * Constructs a validated implementation of {@link BasicAuthSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BasicAuthSpec(Consumer<BasicAuthSpec> spec) {
        spec.accept(this);
        validate();
        update(username, password);
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException if a required parameter is missing
     * @throws IllegalArgumentException if a parameter has an invalid value
     */
    public void validate() {
        Objects.requireNonNull(propertyKey, "propertyKey is required");
        Objects.requireNonNull(valueTemplate, "valueTemplate is required");
        if (username == null && password == null)
            throw new NullPointerException("username or password are required");
    }

    private void update(String username, String password) {
        String encoded = java.util.Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
        encoded = valueTemplate.replace("{base64}", encoded);

        // set params
        headerMap = Map.of("Authorization", encoded);
    }
}
