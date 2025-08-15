package com.shopeazy.order.order_service.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	private Long orderId;
	
	private Long userId;
	private String email;
	private String productName;
	private Long quantity;
	private String status;
	private Long totalAmount;
	
	@Column(updatable = false)
	private LocalDateTime createdAt;
	
	public Order(Long orderId, Long userId, String email, String productName, Long quantity, String status, Long totalAmount,
			LocalDateTime createdAt) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.email = email;
		this.productName = productName;
		this.quantity = quantity;
		this.status = status;
		this.totalAmount = totalAmount;
		this.createdAt = createdAt;
	}

	public Order() {
		super();
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
