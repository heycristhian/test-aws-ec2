FROM openjdk:17-jdk-slim-buster

WORKDIR /app

COPY ./target/aws-0.0.1-SNAPSHOT.jar /app/aws.jar

CMD ["java", "-jar", "aws.jar"]