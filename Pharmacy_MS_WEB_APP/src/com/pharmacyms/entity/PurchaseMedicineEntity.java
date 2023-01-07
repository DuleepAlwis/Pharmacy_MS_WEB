package com.pharmacyms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="purchase_medicine_tb")
public class PurchaseMedicineEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="purchase_medicine_id")
	private long purchase_medicine_id;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="purchased_date")
	private Date purchased_date;
	
	@ManyToOne(targetEntity = com.pharmacyms.entity.MedicineEntity.class)
	@JoinColumn(name="medicine_id",nullable=false)
	private MedicineEntity purchasedMedidcineId;
	
	@ManyToOne(targetEntity = com.pharmacyms.entity.PurchaseEntity.class)
	@JoinColumn(name="purchase_id",nullable=false)
	private PurchaseEntity purchases;
	
	
}
