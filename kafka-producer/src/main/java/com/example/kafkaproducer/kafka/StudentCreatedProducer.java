package com.example.kafkaproducer.kafka;

import com.example.kafkaproducer.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentCreatedProducer {

    private static final String STUDENT_CREATED_TOPIC = "student-created-topic";

    @Autowired
    public KafkaTemplate<String, Student> kafkaTemplate;

    public void publishMessage(Student student){
        kafkaTemplate.send(STUDENT_CREATED_TOPIC, student);
        log.info("MESSAGE PUBLISHED ON CHANNEL " + STUDENT_CREATED_TOPIC + " WITH CONTENT: " + student.toString());
    }


}
