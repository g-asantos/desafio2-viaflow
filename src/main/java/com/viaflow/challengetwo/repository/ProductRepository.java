package com.viaflow.challengetwo.repository;

import com.viaflow.challengetwo.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
