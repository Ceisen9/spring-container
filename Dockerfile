FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD target/spring-container-0.0.1-SNAPSHOT.jar spring-container-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-container-0.0.1-SNAPSHOT.jar"]