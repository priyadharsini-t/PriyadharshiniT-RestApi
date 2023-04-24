package com.twitter11.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TwitterLoginController {
 
	@GetMapping("/login")
	public String login()
	{
		return "Login Successful";
	}
}
