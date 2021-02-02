package com.viaflow.challengetwo.repository;

import com.viaflow.challengetwo.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAllByIdAsc();
    
}
