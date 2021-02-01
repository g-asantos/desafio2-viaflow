package com.viaflow.challengetwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viaflow.challengetwo.model.Suggestion;

public interface SuggestionRepository extends JpaRepository<Suggestion, Long> {
	
}
