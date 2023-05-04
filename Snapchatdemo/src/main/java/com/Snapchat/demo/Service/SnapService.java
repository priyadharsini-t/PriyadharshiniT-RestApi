package com.Snapchat.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Snapchat.demo.Model.Snap;
import com.Snapchat.demo.repository.SnapRepository;

import jakarta.transaction.Transactional;
@Service

public class SnapService {
@Autowired
public SnapRepository repobj;

public Snap SaveInfo(@RequestBody Snap obj)
{
	return repobj.save(obj);
}
	public List<Snap> getAllSnap() {
	List<Snap> snapList=repobj.findAll();
		return snapList;
	}
public Snap updateInfo(Snap eee)
{
	return repobj.saveAndFlush(eee);
}
public void deleteInfo(int id)
{
	repobj.deleteById(id);
}
public List<Snap> sort(String id) {
	return repobj.findAll(Sort.by(id));
}

public List<Snap> sortdscStudent(String field) {
	return repobj.findAll(Sort.by(Direction.DESC,field));
	
}
public Page<Snap> pagingSnap(int offset,int pageSize)
{
	Pageable paging=PageRequest.of(offset,pageSize);
	Page<Snap>studData=repobj .findAll(paging);
	//List<Student>studList=studData.getContent();
    return studData;
}
public List<Snap> pagingAndSortingEmployees(int offset,
		int pageSize,String field) {
	Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		Page<Snap> stud=repobj.findAll(paging);
		return stud.getContent();
	}
public List<Snap> fetchStudentsByNamePrefix(String prefix)
{
	  return repobj.findByNameStartingWith(prefix);
}

public List<Snap> saveStudentByNameSufix(String Sufix)
{
	return repobj.findByNameEndingWith(Sufix);
}

public List<Snap>getStudentsByDepartment(String email,String name)
{
	 return repobj.getStudentsByDepartment(email,name);
}
@Transactional
public int deleteStudentByName(String name)
{
	return repobj.deleteStudentByName(name);
}
public List<Snap>getStudentByDepartment(String email,String name)
{
	return repobj.getStudentsByDepartment(email,name);
}
@Transactional
public int updateStudentByName(String email,String name)
{
	return repobj.updateStudentByName(email,name);
}

//native
@Transactional
public List<Snap> fetchStudent(String name)
{
	return repobj.fetchStudent(name);
}
}
