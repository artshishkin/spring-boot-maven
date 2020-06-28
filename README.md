#10 Maven for Spring Boot Tutorial

##110 Running Spring Boot from Maven
- `mvn clean spring-boot:run`

##111 Spring Boot Integration Tests with Maven Failsafe
- `mvn clean verify`
- need to create and configure `failsafe` for integration tests

#####For example
- create integration test (i.e. ExampleControllerTestIT)
- add
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-failsafe-plugin</artifactId>
</plugin>

