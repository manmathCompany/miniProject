package com.mn.service;

import java.util.List;

import com.mn.entity.ContactDetails;

public interface ContactService {

	public String getName(int id);
	
	public List<ContactDetails> getEmp();
}
