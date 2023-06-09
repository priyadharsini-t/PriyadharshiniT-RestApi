package com.EducationLoan.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginModel {
	@Id
	private String email;
	private String password;
	
	public LoginModel() {
		super();
	}
	@Override
	public String toString() {
		return "LoginModel [email=" + email + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
  
}
