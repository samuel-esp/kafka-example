FROM openjdk:11-jdk

ADD target/kafka-producer-0.0.1-SNAPSHOT.jar kafka-producer-0.0.1-SNAPSHOT.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "kafka-producer-0.0.1-SNAPSHOT.jar"]

HEALTHCHECK --start-period=30s --interval=10s CMD curl -f http://localhost:8085/actuator/health || exit 1