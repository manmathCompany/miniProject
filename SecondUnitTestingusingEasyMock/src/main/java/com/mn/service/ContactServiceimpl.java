package com.mn.service;

import com.mn.dao.ContactDao;
import com.mn.entity.Contact;

public class ContactServiceimpl implements ContactService {
	private ContactDao dao;
	
	

	public void setDao(ContactDao dao) {
		this.dao = dao;
	}



	public String getname(int id) {
		String s=dao.findnameById(id);
		if(s!=null) {
			return s;
		}
		else
		return "Record not Found";
	}

	public Contact getDetails(int id) {
Contact cnt=new Contact();

		return cnt;
	}
}
