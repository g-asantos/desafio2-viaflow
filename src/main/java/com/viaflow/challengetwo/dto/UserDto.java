package com.viaflow.challengetwo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;



import com.viaflow.challengetwo.model.User;

public class UserDto {

	
	@NotEmpty @NotBlank
	private String login;
	

	private String completeName;
	
	@NotEmpty @NotBlank
	private String password;
	
	
	public UserDto(User user) {
		this.login = user.getLogin();
		this.completeName = user.getCompleteName();
		this.password = user.getPassword();
	}

	public UserDto() {
		
	}

	public String getLogin() {
		return login;
	}

	public String getCompleteName() {
		return completeName;
	}

	public String getPassword() {
		return password;
	}

	
	
	
}
