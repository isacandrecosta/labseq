FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /usr/src/app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /work/

COPY --from=build /usr/src/app/target/labseq-service-1.0.0-runner.jar /work/application.jar

EXPOSE 8080

CMD ["java", "-jar", "application.jar"]