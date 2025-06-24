package com.example.product_catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product_catalog.model.Product;
import com.example.product_catalog.repository.ProductCatalogRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductCatalogRepository productRepo;
	
	public Product addProduct(Product product) {
		
		productRepo.save(product);
		return product;
	}

}
