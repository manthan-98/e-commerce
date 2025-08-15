package com.kafka.messenger.dto;

public class OrderEvent {
    private Long orderId;
	private String email;
    private String productName;
    private Long quantity;
    
    public OrderEvent() {
    	
    }

    public OrderEvent(Long orderId, String email, String productName, Long quantity) {
		super();
		this.orderId = orderId;
		this.email = email;
		this.productName = productName;
		this.quantity = quantity;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
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

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
}
