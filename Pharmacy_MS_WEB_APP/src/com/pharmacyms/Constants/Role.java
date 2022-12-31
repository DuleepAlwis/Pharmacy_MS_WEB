package com.pharmacyms.Constants;

public enum Role {

	ADMIN("Admin"),
	CUSTOMER("Customer"),
	EMPLOYEE("EMPLOYEE");
	
	private String value;
	
	Role(String string) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
}
