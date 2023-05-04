package com.Snapchat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Snapchat.demo.Model.snapLogin;

public interface snapLoginrep extends JpaRepository<snapLogin, Integer> 
{
snapLogin findByusername(String username);
}
