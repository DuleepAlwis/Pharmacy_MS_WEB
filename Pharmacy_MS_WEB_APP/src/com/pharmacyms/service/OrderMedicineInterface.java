package com.pharmacyms.service;

public interface OrderMedicineInterface<I,U> {

	public boolean save(I order,U medicine);
	public boolean update(I order,U medicine);
	public I getOrderById(long id);
	public U getMedicineById(long id);
}
