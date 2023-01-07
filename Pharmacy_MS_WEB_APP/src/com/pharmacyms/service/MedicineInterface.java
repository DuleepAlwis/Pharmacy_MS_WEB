package com.pharmacyms.service;

public interface MedicineInterface<T,U> {

	public U saveMedicine(T medicine);
	public U updateMedicine(T medicine);
	public T searchByName(String name);
	public T searchById(U id);
	public boolean remove(U id);
	
}
