package com.viaflow.challengetwo.controller;

import java.util.List;
import java.util.Optional;



import com.viaflow.challengetwo.dto.ProductDto;
import com.viaflow.challengetwo.model.Product;
import com.viaflow.challengetwo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;

    
    @GetMapping
    @Cacheable(value="productsList")
    public List<ProductDto> list(){

            List<Product> products = productRepository.findAllByOrderByIdAsc();
            return ProductDto.converter(products);
    }
    
    
    @PutMapping("/{id}")
    @Transactional
    @CacheEvict(value="productsList", allEntries = true)
    public ResponseEntity<ProductDto> increaseRating(@PathVariable Long id){
        Optional<Product> optional = productRepository.findById(id);
       
        if(optional.isPresent()){
        	Product product = optional.get();
        	
        	product.setRating(product.getRating() + 1);
            return ResponseEntity.ok(new ProductDto(product));
        } 
        
        return ResponseEntity.notFound().build();
    }
    
    

}
