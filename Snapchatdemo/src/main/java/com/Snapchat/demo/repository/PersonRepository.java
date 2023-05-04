package com.Snapchat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Snapchat.demo.Model.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> {

}
