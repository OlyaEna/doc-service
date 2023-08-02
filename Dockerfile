FROM openjdk:20-jdk
COPY target/*.jar doc-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/doc-service-0.0.1-SNAPSHOT.jar"]