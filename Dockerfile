FROM gradle:jdk17-corretto AS test

WORKDIR /auth-service
COPY .env .
COPY build.gradle .
COPY settings.gradle .

RUN gradle dependencies

COPY src src
RUN gradle test

FROM gradle:jdk17-corretto AS build

WORKDIR /auth-service
COPY .env .
COPY build.gradle .
COPY settings.gradle .

RUN gradle dependencies

COPY src src
RUN gradle build -x test

FROM openjdk:17

COPY --from=build /auth-service/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=8080"]
