FROM openjdk:17
LABEL maintainer="Gabriel Poersch"
COPY ../target/*.jar app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "app.jar"]
EXPOSE 8080