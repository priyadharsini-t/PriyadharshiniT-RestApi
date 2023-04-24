package com.Snapchat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Snapchat.demo.Model.Snap;

@Repository
public interface SnapRepository  extends JpaRepository<Snap, Integer> {

}
