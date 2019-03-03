FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/gateway-0.0.1-SNAPSHOT.jar api-gateway.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","api-gateway.jar"]