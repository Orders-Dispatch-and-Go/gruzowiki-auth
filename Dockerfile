FROM gradle:8.6.0-jdk17 AS build

WORKDIR /auth-service
COPY .env .
COPY build.gradle .
COPY settings.gradle .

RUN gradle dependencies

COPY src src
RUN gradle build

FROM openjdk:17

COPY --from=build /auth-service/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=8080"]