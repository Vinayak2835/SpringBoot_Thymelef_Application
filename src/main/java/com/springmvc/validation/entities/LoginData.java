package com.springmvc.validation.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message="UserName can't be empty")
	@Size(min=3,max=10,message="UserName between 3 to 10 characters")
	private String userName;
	
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Invalid email")
	private String email;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", passWord=" + email + "]";
	}

}
