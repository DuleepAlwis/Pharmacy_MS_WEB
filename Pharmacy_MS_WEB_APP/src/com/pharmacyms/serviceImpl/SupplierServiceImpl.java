package com.pharmacyms.serviceImpl;

import org.springframework.stereotype.Service;

import com.pharmacyms.dto.SupplierDTO;
import com.pharmacyms.service.SupplierInterface;

@Service
public class SupplierServiceImpl implements SupplierInterface<Long,SupplierDTO>{

	@Override
	public Long saveSupplier(SupplierDTO supplier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateSupplier(SupplierDTO supplier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplierDTO getSupplierByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplierDTO getSupplierById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeSupplier(SupplierDTO supplier) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
