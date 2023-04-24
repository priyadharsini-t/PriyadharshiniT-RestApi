package com.Instagram.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstagramController {
	@GetMapping("/getpost")
	public String getPost(@RequestParam String username)
	{
		return "The post of "+username;
	}

}
