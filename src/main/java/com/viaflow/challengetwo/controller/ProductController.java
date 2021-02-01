package com.viaflow.challengetwo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.viaflow.challengetwo.controller.form.IncreaseProductRatingForm;
import com.viaflow.challengetwo.dto.ProductDto;
import com.viaflow.challengetwo.model.Product;
import com.viaflow.challengetwo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProductController {
    


    //they dont create nothinnnnn'
    //put method of product
    // post suggestion method 
    // authorization

    @Autowired
    private ProductRepository productRepository;

    
    @GetMapping
    public List<ProductDto> list(){

            List<Product> products = productRepository.findAll();
            return ProductDto.converter(products);
    }
    
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<ProductDto> increaseRating(@PathVariable Long id, 
    @RequestBody @Valid IncreaseProductRatingForm increasedRatingProduct){
        Optional<Product> optional = productRepository.findById(id);
       
        if(optional.isPresent()){
        	
            Product product = increasedRatingProduct.addRating(id, productRepository);
            return ResponseEntity.ok(new ProductDto(product));
        } 
        
        return ResponseEntity.notFound().build();
    }
    
    

}