package com.mn.dao;

import com.mn.entity.Contact;

public interface ContactDao {

	public String findnameById(int id);
	public Contact FindDetails(int id);
}
