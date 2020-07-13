package com.mn.entity;

public class ContactDetails {


	private int cId;
	private String cName;
	private String cAddrs;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAddrs() {
		return cAddrs;
	}
	public void setcAddrs(String cAddrs) {
		this.cAddrs = cAddrs;
	}
	@Override
	public String toString() {
		return "ContactDetails [cId=" + cId + ", cName=" + cName + ", cAddrs=" + cAddrs + "]";
	}
	public ContactDetails(int cId, String cName, String cAddrs) {
		
		this.cId = cId;
		this.cName = cName;
		this.cAddrs = cAddrs;
	}
	
	
}
