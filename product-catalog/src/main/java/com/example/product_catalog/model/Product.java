package com.example.product_catalog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long product_id;
	private String name;
	private String discription;
	private Long category_id;
	private Integer product_price;
	
	public Product() {
		
	}
	
	public Product(Long product_id, String name, String discription, Long category_id, Integer product_price) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.discription = discription;
		this.category_id = category_id;
		this.product_price = product_price;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public Integer getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Integer product_price) {
		this.product_price = product_price;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", name=" + name + ", discription=" + discription
				+ ", category_id=" + category_id + ", product_price=" + product_price + "]";
	}

}
