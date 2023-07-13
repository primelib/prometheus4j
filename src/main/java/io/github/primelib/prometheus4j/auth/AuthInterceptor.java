package io.github.primelib.prometheus4j.auth;

import java.util.List;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthInterceptor implements RequestInterceptor {
    List<AuthMethod> authMethods;

    @Override
    public void apply(RequestTemplate template) {
        if (authMethods == null || authMethods.isEmpty()) {
            return;
        }

        for (AuthMethod authMethod : authMethods) {
            if (authMethod.headerMap() != null) {
                authMethod.headerMap().forEach(template::header);
            }
            if (authMethod.queryMap() != null) {
                authMethod.queryMap().forEach(template::query);
            }
        }
    }
}
