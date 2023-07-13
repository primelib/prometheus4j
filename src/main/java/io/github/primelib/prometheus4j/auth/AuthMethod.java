package io.github.primelib.prometheus4j.auth;

import java.util.Map;

public interface AuthMethod {
    Map<String, String> headerMap();
    Map<String, String> queryMap();
    Map<String, String> cookieMap();
}
