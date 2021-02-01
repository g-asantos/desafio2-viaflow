package com.viaflow.challengetwo.controller.form;

import com.viaflow.challengetwo.model.Product;
import com.viaflow.challengetwo.repository.ProductRepository;

public class IncreaseProductRatingForm {
	
	private String rating;

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public Product addRating(Long id, ProductRepository productRepository) {
	        Product product = productRepository.getOne(id);
	        product.setRating(product.getRating() + 1);
	        
			return product;
	}
	
	
}
