package com.mn.service;

import java.util.List;

import com.mn.binding.Contact;

public interface ContactService {

	
	public boolean saveContact(Contact c);
	public List<Contact> getAllContacts( );
	public Contact getContactById(Integer cid);
	//public boolean updateContact(Contact c);
	public String deleteContact(Integer cid);
}
