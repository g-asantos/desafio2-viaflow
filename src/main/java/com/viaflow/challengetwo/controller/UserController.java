package com.viaflow.challengetwo.controller;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.viaflow.challengetwo.dto.UserDto;
import com.viaflow.challengetwo.model.User;
import com.viaflow.challengetwo.repository.UserRepository;

@RestController
@RequestMapping("/login")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    
    @PostMapping
	@Transactional
	public ResponseEntity<String> login(@RequestBody @Valid UserDto userDto) {
		
    	Optional<User> user = Optional.of(userRepository.findByLogin(userDto.getLogin()));
    	
    	
    	
    	if(!user.isPresent()) {
    		return ResponseEntity.notFound().build();
    	} else if(!userDto.getPassword().equals(user.get().getPassword())){
    		return ResponseEntity.status(401).body("Senha incorreta");
    	}
    	UserDto returnUserDto = new UserDto(user.get());
    	return ResponseEntity.ok().body("Login realizado! Bem-vindo " + returnUserDto.getCompleteName());
	}

    
    

}

