plugins {
    `java-library`
    id("me.philippheuer.configuration") version "0.10.8"
}

val version: String = properties["version"] as? String ?: "0.0.0"

projectConfiguration {
    type.set(me.philippheuer.projectcfg.domain.ProjectType.LIBRARY)
    javaVersion.set(JavaVersion.VERSION_17)
    artifactGroupId.set("io.github.primelib")
    artifactId.set("prometheus4j")
    artifactDisplayName.set("prometheus4j")
    artifactDescription.set("Java Client for the Prometheus REST APIs.")

    pom = { pom ->
        pom.url.set("https://github.com/primelib/prometheus4j")
        pom.issueManagement {
            system.set("GitHub")
            url.set("https://github.com/primelib/prometheus4j/issues")
        }
        pom.inceptionYear.set("2023")
        pom.developers {
            developer {
                id.set("PhilippHeuer")
                name.set("Philipp Heuer")
                email.set("git@philippheuer.me")
                roles.addAll("maintainer")
            }
        }
        pom.licenses {
            license {
                name.set("MIT License")
                distribution.set("repo")
                url.set("https://raw.githubusercontent.com/primelib/prometheus4j/main/LICENSE")
            }
        }
        pom.scm {
            connection.set("scm:git:git://github.com/primelib/prometheus4j.git")
            developerConnection.set("scm:git:git://github.com/primelib/prometheus4j.git")
            url.set("https://github.com/primelib/prometheus4j")
        }
    }
}

dependencies {
    // bom
    api(platform("io.github.openfeign:feign-bom:13.1"))
    api(platform("io.github.resilience4j:resilience4j-bom:2.1.0"))
    api(platform("com.fasterxml.jackson:jackson-bom:2.15.3"))
    api(platform("io.github.primelib.primecodegenlib.java:bom:0.0.2"))

    // annotations
    implementation("org.jetbrains:annotations:24.1.0")

    // feign
    implementation("io.github.openfeign:feign-core")
    implementation("io.github.openfeign:feign-jackson")
    implementation("io.github.openfeign:feign-slf4j")
    implementation("io.github.openfeign:feign-okhttp")
    implementation("io.github.openfeign:feign-micrometer")

    // codegen libs
    api("io.github.primelib.primecodegenlib.java:feign-common")

    // jackson
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")

    // metrics
    api("io.micrometer:micrometer-core:1.12.0")

    // test
    testImplementation("org.slf4j:slf4j-simple:2.0.9")
}
