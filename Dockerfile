FROM openjdk:8
EXPOSE 8080
ADD target/ashwin-web-0.0.1-SNAPSHOT.jar ashwin-web-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ashwin-web-0.0.1-SNAPSHOT.jar"]