FROM openjdk:11
COPY ./target/Rachael-Server-01-1.0-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]