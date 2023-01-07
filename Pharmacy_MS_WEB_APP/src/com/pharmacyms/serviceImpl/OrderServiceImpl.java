package com.pharmacyms.serviceImpl;

import org.springframework.stereotype.Service;

import com.pharmacyms.dto.OrderDTO;
import com.pharmacyms.service.OrderInterface;

@Service
public class OrderServiceImpl implements OrderInterface<Long ,OrderDTO> {

	@Override
	public Long saveOrder(OrderDTO order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateOrder(OrderDTO order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO getOrderByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO getOrderById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeOrder(OrderDTO order) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
