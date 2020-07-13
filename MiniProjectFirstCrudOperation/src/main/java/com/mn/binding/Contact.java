package com.mn.binding;

import java.sql.Date;

import lombok.Data;

@Data
public class Contact {

	
	Integer contactId;
	String contactName;
	String contactEmail;
	Long contactNumber;
	//Date createdDate;
	//Date updatedDate;
}
