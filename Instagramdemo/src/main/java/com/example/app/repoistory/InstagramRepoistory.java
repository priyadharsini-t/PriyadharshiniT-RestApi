package com.example.app.repoistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.Instagram.demo.model.priya;

@Repository
public interface InstagramRepoistory extends JpaRepository<priya, Integer> {

}
