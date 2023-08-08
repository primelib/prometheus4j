# *Prometheus4J*

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/prometheus4j)](https://central.sonatype.com/artifact/io.github.primelib/prometheus4j)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/prometheus4j/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/prometheus4j)

> A java client for the Prometheus REST API.

## Installation

```gradle
implementation("io.github.primelib:prometheus4j:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/prometheus4j).

## Usage

*Consumer Specification Approach*

```java
PrometheusHTTPConsumerApi client = PrometheusHTTPFactory.create(spec -> {
    spec.api(PrometheusHTTPConsumerApi.class);
    spec.baseUrl("http://localhost:9090/api/v1");
    // optional auth
    spec.basicAuth(authSpec -> {
        authSpec.username("<username>");
        authSpec.password("<password>");
    });
});

RuleReadResponse alertingRules = client.readRules(spec ->{
    spec.type("alert")
});
```

*Parameter Approach*

```java
PrometheusHTTPApi client = PrometheusHTTPFactory.create(spec -> {
    spec.api(PrometheusHTTPApi.class);
    spec.baseUrl("http://localhost:9090/api/v1");
    // optional auth
    spec.basicAuth(authSpec -> {
        authSpec.username("<username>");
        authSpec.password("<password>");
    });
});

RuleReadResponse alertingRules = client.readRules("alert");
```

**_NOTE:_** The  `Parameter Approach` can break if the API changes. The `Consumer Specification Approach` is more resilient to API changes.

## Links

- [Documentation](https://primelib.github.io)
- [Contribute](https://primelib.github.io/contribution/)

## License

Released under the [MIT License](./LICENSE).
