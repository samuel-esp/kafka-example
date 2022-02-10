package com.example.kafkaconsumer.kafka;

import com.example.kafkaconsumer.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentCreatedConsumer {

    //TO START ZOOKEPER: "zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties" or "brew services start zookeeper"
    //TO START KAFKA: "kafka-server-start /usr/local/etc/kafka/server.properties" or "brew services start kafka"

    private static final String STUDENT_CREATED_TOPIC = "student-created-topic";
    private static final String GROUP_ID = "group-id";

    @KafkaListener(topics = STUDENT_CREATED_TOPIC, groupId = GROUP_ID, containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consumeMessage(Student message){
        log.info(message.toString());
    }

}

