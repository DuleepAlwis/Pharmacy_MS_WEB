package com.pharmacyms.Constants;

public enum PurchaseType {

	ORDER_PURCHASE("Order_Purchase"),
	CHECKIN_PURCHASE("Checkin_Purchase");
	
	private String value;
	
	 PurchaseType(String value){
		 this.value = value;
	 }
	 
	 public void setValue(String value) {
		 this.value = value;
	 }
	 
	 public String getValue() {
		 return this.value;
	 }
}
