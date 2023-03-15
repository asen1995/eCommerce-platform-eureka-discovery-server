FROM adoptopenjdk/openjdk11:alpine-jre
ARG VERSION=0.0.1-SNAPSHOT

EXPOSE 8761

ADD target/Ecommerce-platform-discovery-server-${VERSION}.war app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
