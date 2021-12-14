# juneyao-public-api

This project contains neccessary classes, enums and interfaces for de-/serialization of Juneyao Airline public API.

## Maven

Maven package can be found on [Maven Central](https://repo1.maven.org/maven2/com/newpathfly/juneyao-public-api/).

To add it as a dependency to your project, include following in the `<dependencies>` section in the `pom.xml` along with properiate version number.

```xml
<dependency>
  <groupId>com.newpathfly</groupId>
  <artifactId>juneyao-public-api</artifactId>
  <version><!-- version number --></version>
</dependency>
```

## Bean Validation

Each class comes with bean validation constraints which could be used for request and response validation before proceeding with the actual logic.

See [ModelValidator](src/main/java/com/juneyao/api/utils/ModelValidator.java) for usage.
