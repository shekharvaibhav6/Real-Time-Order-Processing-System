package com.example.OrderServiceApp.controller;

import com.example.OrderServiceApp.config.KafkaProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private KafkaProducerConfig kafkaProducer;

    @PostMapping("/placeOrder")
    public ResponseEntity<String> placeOrder(@RequestBody String orderDetails) {
        kafkaProducer.sendMessage("order_topic", orderDetails);
        return ResponseEntity.ok("Order placed successfully!");
    }
}
