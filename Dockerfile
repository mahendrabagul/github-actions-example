FROM openjdk:8-alpine
ADD target/github-actions-example-0.0.1.jar github-actions-example-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "github-actions-example-0.0.1.jar"]