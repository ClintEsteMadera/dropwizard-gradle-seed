# dropwizard-gradle-seed

A very simple and basic skeleton for getting started with Dropwizard, using Gradle as build system (rather than Maven)

It bootstraps a fully functional HTTP server (Jetty) that returns a salutation in JSON. It follows the example on [Dropwizard Getting Started Guide](https://dropwizard.github.io/dropwizard/getting-started.html).

## Features
- Java 8
- Dropwizard 0.9.2
- Gradle 2.4
- TestNG 6.9.10 (instead of Junit)

## Start up server
- Run
```./gradlew run```
- Go to http://localhost:8080/hello-world

## Create an IntelliJ project
- Run
```./gradlew idea```