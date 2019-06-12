FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/spring-eureka-server-0.0.1-SNAPSHOT.jar /app/eureka/spring-eureka-server-0.0.1-SNAPSHOT.jar
WORKDIR   app/eureka
ENTRYPOINT  ["java","-jar","spring-eureka-server-0.0.1-SNAPSHOT.jar"]