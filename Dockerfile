FROM gradle:8.6.0-jdk17 AS test

WORKDIR /auth-service
COPY .env .
COPY build.gradle .
COPY settings.gradle .

RUN gradle dependencies

COPY src src
RUN gradle test

FROM gradle:8.6.0-jdk17 AS build

WORKDIR /auth-service
COPY .env .
COPY build.gradle .
COPY settings.gradle .

RUN gradle dependencies

COPY src src
RUN gradle build -x test

FROM eclipse-temurin:17-jre

COPY --from=build /auth-service/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=8080"]
