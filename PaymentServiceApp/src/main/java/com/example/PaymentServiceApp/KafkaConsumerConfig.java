package com.example.PaymentServiceApp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerConfig {

    @KafkaListener(topics = "order_topic", groupId = "payment_group")
    public void consumeMessage(String message) {
        System.out.println("Payment Notification Service - Received message: Payment Completed ");
    }
}
