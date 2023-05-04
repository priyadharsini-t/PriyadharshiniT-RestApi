package com.OneToMany.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToMany.demo.Model.question;

public interface questionRepo extends JpaRepository<question,Integer>{



}
