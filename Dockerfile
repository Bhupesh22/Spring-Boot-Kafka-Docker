FROM openjdk:17
WORKDIR /app
COPY target/spring-docker.jar .
CMD ["java", "-jar", "spring-docker.jar"]