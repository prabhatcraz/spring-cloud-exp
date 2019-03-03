FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/beers-0.0.1-SNAPSHOT.jar beers.jar
EXPOSE 8005
ENTRYPOINT ["java","-jar","beers.jar"]