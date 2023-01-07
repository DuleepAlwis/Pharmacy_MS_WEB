package com.pharmacyms.serviceImpl;

import org.springframework.stereotype.Service;

import com.pharmacyms.dto.MedicineDTO;
import com.pharmacyms.service.MedicineInterface;

@Service
public class MedicineServiceImpl implements MedicineInterface<MedicineDTO,Long> {

	@Override
	public Long saveMedicine(MedicineDTO medicine) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Long updateMedicine(MedicineDTO medicine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicineDTO searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicineDTO searchById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
