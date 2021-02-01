package com.viaflow.challengetwo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.viaflow.challengetwo.model.Suggestion;

public class SuggestionDto {
	
	@NotEmpty @NotBlank
    private String name;
	
	@NotEmpty @NotBlank
    private String storeName;
	
	@NotEmpty @NotBlank
    private String suggestion;
    
    
    
	public SuggestionDto(Suggestion suggestion) {
		this.name = suggestion.getName();
		this.storeName = suggestion.getStoreName();
		this.suggestion = suggestion.getSuggestion();
	}




	public SuggestionDto() {
	}




	public String getName() {
		return name;
	}



	public String getStoreName() {
		return storeName;
	}



	public String getSuggestion() {
		return suggestion;
	}
    
    
    
}
