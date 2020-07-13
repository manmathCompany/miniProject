package com.mn.test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.mn.dao.ContactDao;
import com.mn.entity.ContactDetails;
import com.mn.service.ContactService;
import com.mn.service.ContactServiceImpl;

public class PowerMockTest {

	@Test
	public void test1() {
		
		
		ContactServiceImpl service= new ContactServiceImpl() ;
		
		//create dao object by calling mock method
		ContactDao dao=PowerMockito.mock(ContactDao.class);
		
		//set dao object value
		when(dao.getNameById(101)).thenReturn("suresh");
		
		service.setDao(dao);
		
		String name=dao.getNameById(101);
		
		assertNotNull(name);
	}
	
	@Test
	public void test_02() {
	
		ContactServiceImpl impl= new ContactServiceImpl();
		
		ContactDao dao=PowerMockito.mock(ContactDao.class);
		
		List<ContactDetails> list=new ArrayList<ContactDetails>();
		list.add(new ContactDetails(101, "raghu", "hyd"));
		list.add(new ContactDetails(102, "raju", "delhi"));
		
		when(dao.getEmpDetails()).thenReturn(list);
		
		impl.setDao(dao);
		
		List<ContactDetails> list1=impl.getEmp();
		
		assertNotNull(list1);
	}
}
;