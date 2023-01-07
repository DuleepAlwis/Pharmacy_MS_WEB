package com.pharmacyms.serviceImpl;

import org.springframework.stereotype.Service;
import com.pharmacyms.dto.PurchaseDTO;
import com.pharmacyms.service.PurchaseInterface;

@Service
public class PurchaseServiceImpl implements PurchaseInterface<Long,PurchaseDTO> {

	@Override
	public Long savePurchase(PurchaseDTO purchase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updatePurchase(PurchaseDTO purchase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseDTO getPurchaseById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removePurchase(PurchaseDTO purchase) {
		// TODO Auto-generated method stub
		return false;
	}

}
