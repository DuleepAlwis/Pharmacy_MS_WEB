package com.pharmacyms.service;

public interface PurchaseMedicineInterface<I,U> {

	public boolean save(I purchase,U medicine);
	public boolean update(I purchase,U medicine);
	public I getPurchaseById(long id);
	public U getMedicineById(long id);
}
