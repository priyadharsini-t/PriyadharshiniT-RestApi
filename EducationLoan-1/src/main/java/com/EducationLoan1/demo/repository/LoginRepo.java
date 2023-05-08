package com.EducationLoan1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationLoan1.demo.model.LoginModel;



@Repository
public interface LoginRepo extends JpaRepository<LoginModel,String> {

	void deleteByPassword(String password);

}