package com.mn.service;

import java.util.List;

import com.mn.dao.ContactDao;
import com.mn.entity.ContactDetails;

public class ContactServiceImpl implements ContactService {
	
	private ContactDao dao;
	
	

	public void setDao(ContactDao dao) {
		this.dao = dao;
	}

	public ContactServiceImpl() {
	}
	
	public String getName(int id) {

		String name=dao.getNameById(id);
		return name;
	}
	
	public List<ContactDetails> getEmp() {

		List<ContactDetails> list=null;
		
		list=dao.getEmpDetails();
		return list;
	}

}
