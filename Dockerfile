FROM openjdk:23-ea-8-jdk-slim
WORKDIR /app
COPY target/ReceiveConsumer-0.0.1-SNAPSHOT.jar /app/ReceiveConsumer-0.0.1-SNAPSHOT.jar
EXPOSE 8282
CMD ["java", "-jar", "ReceiveConsumer-0.0.1-SNAPSHOT.jar"]