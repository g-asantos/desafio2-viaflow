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
    private String description;

    public Suggestion(String name, String storeName, String description) {
        this.name = name;
        this.storeName = storeName;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

}
