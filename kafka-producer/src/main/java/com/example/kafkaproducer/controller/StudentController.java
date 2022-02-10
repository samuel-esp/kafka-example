package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.kafka.StudentCreatedProducer;
import com.example.kafkaproducer.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentCreatedProducer studentCreatedProducer;

    @PostMapping("/student")
    public void createNewStudent(@RequestBody Student student){
        studentCreatedProducer.publishMessage(student);
    }

}
