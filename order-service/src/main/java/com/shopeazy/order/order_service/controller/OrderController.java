package com.shopeazy.order.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopeazy.order.order_service.model.Order;
import com.shopeazy.order.order_service.service.OrderServiceImpl;

@RequestMapping(path="/order")
@RestController
public class OrderController {
	
	@Autowired
	private OrderServiceImpl orderServiceImpl;
	
	@PostMapping(path="/neworder")
	public void createOrder(Order order) {
		
		orderServiceImpl.newOrder(order);
	}

}
