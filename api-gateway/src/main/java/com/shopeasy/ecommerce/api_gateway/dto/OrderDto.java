package com.shopeasy.ecommerce.api_gateway.dto;

public class OrderDto {
	
	private Long orderId;
	
	private Long userId;
	private String status;
	private Long totalAmount;

	public OrderDto() {
	}

	public OrderDto(Long orderId, Long userId, String status, Long totalAmount) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.status = status;
		this.totalAmount = totalAmount;
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

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", status=" + status + ", totalAmount="
				+ totalAmount + ", createdAt=" + "]";
	}

}
