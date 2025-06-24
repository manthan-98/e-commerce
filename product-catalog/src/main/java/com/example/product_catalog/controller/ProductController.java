package com.example.product_catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product_catalog.model.Product;
import com.example.product_catalog.service.ProductServiceImpl;

@RequestMapping("/product")
@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@PostMapping("/add")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		
		Product prod = productServiceImpl.addProduct(product);
		
		return new ResponseEntity<>("Product added Successfully", HttpStatus.CREATED);
	}

}
