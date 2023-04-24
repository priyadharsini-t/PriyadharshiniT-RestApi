package com.Snapchat.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Snapchat.demo.Model.Snap;
import com.Snapchat.demo.repository.SnapRepository;
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
}
