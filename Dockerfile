FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/ConcesionarioApp-1.0-SNAPSHOT-jar-with-dependencies.jar ConcesionarioApp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ConcesionarioApp.jar"]
