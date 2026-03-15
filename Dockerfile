# Use Java base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Install Maven and build project
RUN apt-get update && apt-get install -y maven
RUN mvn clean package -DskipTests

# Run the Spring Boot application
CMD ["java","-jar","target/auramarket-backend-0.0.1-SNAPSHOT.jar"]
