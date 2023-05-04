package com.Snapchat.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Snapchat.demo.Model.Snap;

@Repository
public interface SnapRepository  extends JpaRepository<Snap, Integer> {
	
//positional parameter
	@Query("select s from Snap s where s.email=?1 and s.name=?2")
	public List<Snap>getStudentsByDepartment(String dept,String name);
		
	//named parameter
			@Query("select s from Snap s where s.email=:email")
			public List<Snap>getStudentsByDepartment(String email);
			
			//DML
			@Modifying
					@Query("delete from Snap s where s.name=?1")
					public int deleteStudentByName(String name);
			//native
			@Query(value="select*from Snap s where s.name=?1",nativeQuery=true)
			public List<Snap>fetchStudent(String name);
			
			
			@Modifying
			@Query("update  Snap s set s.email=?1 where s.name=?2")
			public int updateStudentByName(String email, String name);
			
			
		List<Snap> findByNameStartingWith(String prefix);
		List<Snap> findByNameEndingWith(String suffix);
		List<Snap> findByEmail(String email);
}
