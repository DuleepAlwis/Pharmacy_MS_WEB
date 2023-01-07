package com.pharmacyms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_medicine_tb")
public class OrderMedicineEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_medicine_id")
	private long order_medicine_id;
	
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne(targetEntity = com.pharmacyms.entity.OrderEntity.class)
	@JoinColumn(name="order_id",nullable=false)
	private OrderEntity orderForMedicine;
	
	@ManyToOne(targetEntity = com.pharmacyms.entity.MedicineEntity.class)
	@JoinColumn(name="medicine_id",nullable=false)
	private MedicineEntity medicineInOrders;
}
