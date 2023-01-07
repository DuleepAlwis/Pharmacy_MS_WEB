package com.pharmacyms.service;

public interface UserInterface<I,U> {

	public I saveUser(U user);
	public I updateUser(U user);
	public U getUserByName(String name);
	public U getUserById(I id);
	public boolean removeUser(U user);
	
}
