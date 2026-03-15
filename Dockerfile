FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Install Maven
RUN apt-get update && apt-get install -y maven

# Build the project
RUN mvn clean package -DskipTests

# Expose Spring Boot port
EXPOSE 8080

# Run the application
CMD ["java","-jar","target/auramarket-backend-0.0.1-SNAPSHOT.jar"]
