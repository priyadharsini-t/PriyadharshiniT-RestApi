package com.Snapchat.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Snapchat.demo.Model.snapLogin;
import com.Snapchat.demo.repository.snapLoginrep;
@Service
public class snapLoginser {

	@Autowired
	private snapLoginrep lrepo;
	public String checkLogin(String username,String password)
	{
		snapLogin user= lrepo.findByusername(username);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	} 
	public snapLogin addUser(snapLogin cl)
	{
		return lrepo.save(cl);
	}
	public List<snapLogin> getUser()
	{
		return lrepo.findAll();
	}
	public snapLogin putUser(snapLogin cl)
	{
		return lrepo.save(cl);
	}
}
