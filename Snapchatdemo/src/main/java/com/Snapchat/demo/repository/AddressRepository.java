package com.Snapchat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Snapchat.demo.Model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
