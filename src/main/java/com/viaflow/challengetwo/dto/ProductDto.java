package com.viaflow.challengetwo.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.viaflow.challengetwo.model.Product;

public class ProductDto {
    private Long id;
	private String title;
	private Integer rating;
    private String image;
    private String category;
    private String description;

    public ProductDto(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.rating = product.getRating();
        this.image = product.getImage();
        this.description = product.getDescription();
        this.category = product.getCategory().getTitle();
    }


    public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public static List<ProductDto> converter(List<Product> products) {
		return products.stream().map(ProductDto::new).collect(Collectors.toList());
	}

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getRating() {
        return rating;
    }

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }
    


}
