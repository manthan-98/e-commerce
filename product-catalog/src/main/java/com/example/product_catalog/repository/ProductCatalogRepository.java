package com.example.product_catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.product_catalog.model.Product;

@Repository
public interface ProductCatalogRepository extends JpaRepository<Product, Long>{

}
