package com.pharmacyms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.pharmacyms.Constants.PurchaseType;

@Entity
@Table(name="purchase_tb")
public class PurchaseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="purchase_id")
	private long purchase_id;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private double price;
	
	@Column(name="discount")
	private double discount;
	
	@Column(name="total_price")
	private double total_price;
	
	@Column(name="type")
	private PurchaseType type;
	
	@Column(name="received")
	private boolean received;
	
	@OneToOne(mappedBy="order_purchase_id")
	private OrderEntity order;
	
	@OneToMany(mappedBy="purchases")
	private List<PurchaseMedicineEntity> purchaseMedicine = new ArrayList<PurchaseMedicineEntity>();
	
}
