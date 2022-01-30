FROM openjdk:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
CMD ["-p", "8080:8080"]
ENTRYPOINT ["java","-jar","/app.jar"]