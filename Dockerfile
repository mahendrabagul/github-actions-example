FROM openjdk:8-alpine
ADD target/mahendrabagul-github-client-0.0.1.jar mahendrabagul-github-client-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "mahendrabagul-github-client-0.0.1.jar"]