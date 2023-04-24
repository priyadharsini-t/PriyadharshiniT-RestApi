package com.Snapchat.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}