package com.viaflow.challengetwo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "sugestões")
public class Suggestion {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String name;
    private String storeName;
    private String suggestion;

    public Suggestion(String name, String storeName, String suggestion) {
        this.name = name;
        this.storeName = storeName;
        this.suggestion = suggestion;
    }

    public Long getId() {
        return id;
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
