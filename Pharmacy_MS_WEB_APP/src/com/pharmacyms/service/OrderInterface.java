package com.pharmacyms.service;

public interface OrderInterface<I,U> {

	public I saveOrder(U order);
	public I updateOrder(U order);
	public U getOrderByCode(String code);
	public U getOrderById(I id);
	public boolean removeOrder(U order);
}
