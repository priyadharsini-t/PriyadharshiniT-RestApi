package com.twitter111.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterLoginController {

	@GetMapping("/login")
	public String Login()
	{
		return "Login Successful!";
	}
}
