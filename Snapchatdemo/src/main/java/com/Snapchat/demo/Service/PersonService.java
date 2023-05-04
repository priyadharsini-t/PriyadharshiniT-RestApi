package com.Snapchat.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Snapchat.demo.Model.Person;
import com.Snapchat.demo.repository.PersonRepository;



@Service
public class PersonService 
{
	@Autowired
	PersonRepository prepo;
	public List<Person> getPerson()
	{
		return prepo.findAll();
	}
	public Person postPerson(Person p)
	{
		return prepo.save(p);
	}

}
