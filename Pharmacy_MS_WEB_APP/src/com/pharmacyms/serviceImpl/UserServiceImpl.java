package com.pharmacyms.serviceImpl;

import org.springframework.stereotype.Service;

import com.pharmacyms.dto.UserDTO;
import com.pharmacyms.service.UserInterface;

@Service
public class UserServiceImpl implements UserInterface<Long,UserDTO>{

	@Override
	public Long saveUser(UserDTO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateUser(UserDTO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeUser(UserDTO user) {
		// TODO Auto-generated method stub
		return false;
	}

}
