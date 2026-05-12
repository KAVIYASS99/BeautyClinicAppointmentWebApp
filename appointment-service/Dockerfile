
# Use official OpenJDK 17 slim image
FROM eclipse-temurin:17-jdk

# Copy the jar from target folder
COPY target/appointment-service-0.0.1-SNAPSHOT.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "/app.jar"]