FROM eclipse-temurin:17

COPY target/hexagonal-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]