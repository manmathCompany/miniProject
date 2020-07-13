package com.mn.dao;

import java.util.List;

import com.mn.entity.ContactDetails;

public interface ContactDao {

	public String getNameById(int id);
	public List<ContactDetails> getEmpDetails();
}
