package com.pharmacyms.Constants;

public enum Role {

	ADMIN("Admin"),
	CUSTOMER("Customer"),
	SUPERUSER("SUPER_USER"),
	EMPLOYEEUSER("EMPLOYEE_USER");
	
	private String value;
	
	Role(String value) {
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
}
