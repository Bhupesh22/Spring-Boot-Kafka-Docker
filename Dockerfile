FROM openjdk:17
WORKDIR /app
COPY target/spring-boot-kafka-docker.jar .
CMD ["java", "-jar", "spring-boot-kafka-docker.jar"]