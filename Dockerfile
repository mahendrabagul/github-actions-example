FROM openjdk:8-alpine
ADD target/github-actions-example-0.0.1-SNAPSHOT.jar github-actions-example-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "github-actions-example-0.0.1-SNAPSHOT.jar"]