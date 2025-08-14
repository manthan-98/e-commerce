package com.shopeazy.order.order_service.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	private Long userId;
	private String status;
	private Long totalAmount;
	
	@Column(updatable = false)
	private LocalDateTime createdAt;

	public Order() {
		super();
	}

	public Order(Long orderId, Long userId, String status, Long totalAmount, LocalDateTime createdAt) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.status = status;
		this.totalAmount = totalAmount;
		this.createdAt = createdAt;
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

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", status=" + status + ", totalAmount="
				+ totalAmount + ", createdAt=" + createdAt + "]";
	}
}
