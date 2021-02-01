package com.viaflow.challengetwo.dto;

import com.viaflow.challengetwo.model.Suggestion;

public class SuggestionDto {

    private String name;
    private String storeName;
    private String description;
    
    
    
	public SuggestionDto(Suggestion suggestion) {
		this.name = suggestion.getName();
		this.storeName = suggestion.getStoreName();
		this.description = suggestion.getDescription();
	}




	public SuggestionDto() {
	}




	public String getName() {
		return name;
	}



	public String getStoreName() {
		return storeName;
	}



	public String getDescription() {
		return description;
	}
    
    
    
}
