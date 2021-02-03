package com.viaflow.challengetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;



@SpringBootApplication
@EnableCaching
public class ChallengetwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengetwoApplication.class, args);
	
	}

}
