# Use official Temurin OpenJDK 17 image
FROM eclipse-temurin:17-jdk

# Copy the built jar file
COPY target/user-service-0.0.1-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT ["java","-jar","/app.jar"]
