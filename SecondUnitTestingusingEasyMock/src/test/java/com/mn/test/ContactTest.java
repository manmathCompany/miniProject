package com.mn.test;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Ignore;
import org.junit.Test;

import com.mn.dao.ContactDao;
import com.mn.entity.Contact;
import com.mn.service.ContactService;
import com.mn.service.ContactServiceimpl;

public class ContactTest {

	
	@Test
	
	public void getnameTest() {
	
	
	ContactDao proxy=EasyMock.createMock(ContactDao.class);
	EasyMock.expect(proxy.findnameById(101)).andReturn("manu");
	ContactServiceimpl service=new ContactServiceimpl();
	
	service.setDao(proxy);
	EasyMock.replay(proxy);
	
	
	String name=service.getname(101);
	
	
	assertNotNull(name);
	}
	
	@Test
	
	public void test() {
		ContactDao daoProxy=EasyMock.createMock(ContactDao.class);
		Contact c=new Contact();
		c.setcId(101);
		c.setcName("manu");
		c.setcAddrs("hyd");
		
		EasyMock.expect(daoProxy.FindDetails(101)).andReturn(c);
		ContactServiceimpl service=new ContactServiceimpl();
		service.setDao(daoProxy);
		EasyMock.replay(daoProxy);
	    Contact c1=service.getDetails(101);
	    assertNotNull(c1);
		
	}
	
	@Test
	public void getNameTest_02() {
		ContactDao proxy=EasyMock.createMock(ContactDao.class);
		EasyMock.expect(proxy.findnameById(102)).andReturn(null);
		ContactServiceimpl service=new ContactServiceimpl();
		
		service.setDao(proxy);
		EasyMock.replay(proxy);
		
		
		String name=service.getname(102);
		
		
		assertNotNull(name);
	}
	
}
