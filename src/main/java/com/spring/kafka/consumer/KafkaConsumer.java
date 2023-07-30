package com.spring.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "mytopic", groupId = "group-id")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}