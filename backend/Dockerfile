FROM quay.io/quarkus/quarkus-distroless-image:2.0

WORKDIR /app
COPY target/quarkus-app /app

CMD ["java", "-jar", "/app/quarkus-run.jar"]