package com.Snapchat.demo.Controller;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Snapchat.demo.Model.snapLogin;
import com.Snapchat.demo.Service.snapLoginser;

@RestController
@RequestMapping("/user")
public class snapLogincon {
	@Autowired
	private snapLoginser lser;
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=lser.checkLogin(username, password);
		return result;
	}
	@PutMapping("/put")
	public snapLogin putUser(@RequestBody snapLogin cl)
	{
		return lser.putUser(cl);
	}
	@PostMapping("/adduser")
	public snapLogin AddUser(@RequestBody snapLogin cl)
	{
		return lser.addUser(cl);
	}

	@GetMapping
	public List<snapLogin> listAll()
	{
		return lser.getUser();
	}
}
