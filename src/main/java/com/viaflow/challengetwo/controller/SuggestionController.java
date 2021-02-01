package com.viaflow.challengetwo.controller;
import java.net.URI;

import javax.validation.Valid;


import com.viaflow.challengetwo.dto.SuggestionDto;
import com.viaflow.challengetwo.model.Suggestion;
import com.viaflow.challengetwo.repository.SuggestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/sugestoes")
public class SuggestionController {


	@Autowired
    private SuggestionRepository suggestionRepository;

	
	@PostMapping
	@Transactional
	public ResponseEntity<SuggestionDto> register(@RequestBody @Valid SuggestionDto suggestionDto, UriComponentsBuilder uriBuilder) {
		Suggestion suggestion = new Suggestion(suggestionDto.getName(), suggestionDto.getStoreName(), 
		suggestionDto.getSuggestion());
		
		suggestionRepository.save(suggestion);

		URI uri = uriBuilder.path("/sugestoes/{id}").buildAndExpand(suggestion.getId()).toUri();
		return ResponseEntity.created(uri).body(new SuggestionDto(suggestion));
	}

}
