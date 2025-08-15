package com.shopeazy.order.order_service.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.shopeazy.order.order_service.dto.OrderEvent;

import com.shopeazy.order.order_service.model.Order;
import com.shopeazy.order.order_service.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	private final KafkaTemplate<String, OrderEvent> kafkaTemplate;
	
	@Autowired
	public OrderServiceImpl(KafkaTemplate<String, OrderEvent> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void newOrder(Order order) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		OrderEvent orderEvent = new OrderEvent();
		orderEvent.setOrderId(order.getOrderId());
		orderEvent.setEmail(order.getEmail());
		orderEvent.setProductName(order.getProductName());
		orderEvent.setQuantity(order.getQuantity());
		order.setOrderId(UUID.randomUUID().getMostSignificantBits());
		order.setCreatedAt(dateTime);
		kafkaTemplate.send("order-topic", orderEvent);
		orderRepository.save(order);
		
	}
}
