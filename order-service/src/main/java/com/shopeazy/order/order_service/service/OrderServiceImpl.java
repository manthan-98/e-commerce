package com.shopeazy.order.order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopeazy.order.order_service.model.Order;
import com.shopeazy.order.order_service.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	public void newOrder(Order order) {
		
		orderRepository.save(order);
		
	}

}
