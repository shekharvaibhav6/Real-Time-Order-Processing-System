package com.example.NotificationApp;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerConfig {

    @KafkaListener(topics = "order_topic", groupId = "notification_group")
    public void consumeMessage(String message) {
        System.out.println("Order Recieved : " + message);

    }
}
