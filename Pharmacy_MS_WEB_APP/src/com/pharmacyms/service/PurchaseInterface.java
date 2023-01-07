package com.pharmacyms.service;

public interface PurchaseInterface<I,U> {

	public I savePurchase(U purchase);
	public I updatePurchase(U purchase);
	public U getPurchaseById(I id);
	public boolean removePurchase(U purchase);
}
