package com.mn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mn.binding.Contact;
import com.mn.entity.ContactEntity;
import com.mn.repo.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repo;
	
	
	@Override
	public boolean saveContact(Contact c) {

		ContactEntity entity=null;
		
		entity=new ContactEntity();
		
		BeanUtils.copyProperties(c, entity);
		
		repo.save(entity);
		
		if(entity!=null) {
			return true;
		}
		else
			
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		List<ContactEntity> listEntity=null;
		List<Contact> listContact=new ArrayList<Contact>();
		listEntity=repo.findAll();
		
		for(ContactEntity entity:listEntity) {
			Contact c=new Contact();
			c.setContactId(entity.getContactId());
			c.setContactName(entity.getContactName());
			c.setContactEmail(entity.getContactEmail());
			c.setContactNumber(entity.getContactNumber());
			
			listContact.add(c);
			}
		
		return listContact;
	}

	@Override
	public Contact getContactById(Integer cid) {
		
		Contact c=new Contact();

		Optional<ContactEntity> findById = repo.findById(cid);
		
		if(findById.isPresent()) {
			ContactEntity entity = findById.get();
			
			BeanUtils.copyProperties(entity, c);
			return c;
		}
		else
			
		return null;
	}

	/*
	 * @Override public boolean updateContact(Contact c) {
	 * 
	 * return false; }
	 */

	@Override
	public String deleteContact(Integer cid) {

		if(cid!=null) {
			repo.deleteById(cid);
			return "Deleted";
		}
		else 
			return "Not delete";
	}

}
