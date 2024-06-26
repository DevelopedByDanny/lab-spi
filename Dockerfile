FROM eclipse-temurin:22-jdk as builder
RUN mkdir /app
COPY consumer/target/consumer-1.0-SNAPSHOT.jar /app/
COPY provider/target/provider-1.0-SNAPSHOT.jar /app/
COPY service/target/service-1.0-SNAPSHOT.jar /app/

FROM eclipse-temurin:22-jdk
WORKDIR /app
COPY --from=builder /app .
CMD java -p . -m com.lab.consumer/com.lab.consumer.Main