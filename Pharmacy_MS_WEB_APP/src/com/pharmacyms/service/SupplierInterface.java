package com.pharmacyms.service;

public interface SupplierInterface<I,U> {

	public I saveSupplier(U supplier);
	public I updateSupplier(U supplier);
	public U getSupplierByName(String name);
	public U getSupplierById(I id);
	public boolean removeSupplier(U supplier);
}
