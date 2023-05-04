package com.Snapchat.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Snapchat.demo.Model.Snap;
import com.Snapchat.demo.Service.SnapService;

@RestController
public class SnapController {
@Autowired
 public SnapService serobj;
@PostMapping("/pr")
public Snap addDetails(@RequestBody Snap obj)
{
	return serobj.SaveInfo(obj);
}
@GetMapping(value="/Sn")
public List<Snap> getAllsnap()
{
	List<Snap>snaplist=serobj.getAllSnap();
	return snaplist;
}
@PutMapping("/ro")
public Snap updateDetails(@RequestBody Snap id)
{
	return serobj.updateInfo(id);
}
@DeleteMapping("/ri/{sid}")
public String deleteDetails(@PathVariable("sid") int id)   
{
	serobj.deleteInfo(id);
	return "id Number "+id+" is deleted";
}
@DeleteMapping("/ka")
public String deleteByRequest(@RequestParam("sid") int id)
{
	serobj.deleteInfo(id);
	return " id Number "+id+" is deleted";
}
@GetMapping("/sorting/{id}")
public List<Snap> SortDetails(@PathVariable("id") String id)
{
	return serobj.sort(id);
}
@GetMapping("/descsorting/{field}")
public List<Snap> sortdscStudent(@PathVariable String field)
{
	return serobj.sortdscStudent(field);

}
@GetMapping("/paging/{offset}/{pageSize}")
public Page<Snap>pagingStudents(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize)
{
	return serobj.pagingSnap(offset, pageSize);
}
@GetMapping("/pagingAndSorting/{offset}/{pageSize}/{field}")

public List<Snap> pagingAndSortingEmployees(@PathVariable int offset,
		@PathVariable int pageSize,
		@PathVariable String field) 
{
	return serobj.pagingAndSortingEmployees(offset, pageSize, field);
}
@GetMapping("/fetchStudentsByNamePrefix/{prefix}")
public List<Snap> fetchStudentsByNamePrefix(@PathVariable String prefix)
{
	  return serobj.fetchStudentsByNamePrefix(prefix);
}
@GetMapping("/saveStudentByNameSufix/{Sufix}")
public List<Snap> saveStudentByNameName(@PathVariable String Sufix)
{
	return serobj.saveStudentByNameSufix(Sufix);
}
@GetMapping("/getStudentsByDepartment/{email}/{name}")
public List<Snap>fetchStudentsByDepartment(@PathVariable String email,@PathVariable String name)
{
	return serobj.getStudentsByDepartment(email,name);
}
@DeleteMapping("/deleteStudentByName/{name}")
public String deleteStudentByName(@PathVariable String name)
{
int result=serobj.deleteStudentByName(name)	;
if(result >0)
	return "Student record deleted";
else
	return "Problem occured while deleting";
}
@GetMapping("/saveStudentByDepartment/{email}/{name}")
public List<Snap> saveStudentByDepartment(@PathVariable String email,@PathVariable String name)
{
	return serobj.getStudentByDepartment(email,name);
}
@PutMapping("/update/{email}/{name}")
public String  updateStudentByName(@PathVariable("email") String email,@PathVariable("name") String name)
{
	int res=serobj.updateStudentByName(email,name);
	if(res>1)
		return "not updated";
	else
		return "updated";
}
@GetMapping("fetchbystaff/{name}")
public List<Snap> fetchStudent(@PathVariable String name){
	return serobj.fetchStudent(name);
}
}