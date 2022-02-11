FROM openjdk:11-jdk

ADD target/kafka-consumer-0.0.1-SNAPSHOT.jar kafka-consumer-0.0.1-SNAPSHOT.jar

EXPOSE 8086

ENTRYPOINT ["java", "-jar", "kafka-consumer-0.0.1-SNAPSHOT.jar"]

HEALTHCHECK --start-period=30s --interval=10s CMD curl -f http://localhost:8086/actuator/health || exit 1