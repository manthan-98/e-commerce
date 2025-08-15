package com.kafka.messenger.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.messenger.dto.OrderEvent;

@Service
public class KafkaProcessor {
	
	private final KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public KafkaProcessor(KafkaTemplate<String, OrderEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "order-topic", groupId = "kafka-group")
    public void listenOrderTopic(OrderEvent orderEvent) {
        System.out.println("Kafka Service received: " + orderEvent);
        kafkaTemplate.send("notification-topic", orderEvent);
    }

}
