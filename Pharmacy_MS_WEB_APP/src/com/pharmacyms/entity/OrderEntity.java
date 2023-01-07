package com.pharmacyms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_tb")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private long id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="district")
	private String district;
	
	@Column(name="mobile")
	private String mobile;
	
	@ManyToOne(targetEntity = com.pharmacyms.entity.UserEntity.class)
	@JoinColumn(name="user_id",nullable=false)
	private long userId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="purchase_id_fk")
	private PurchaseEntity order_purchase_id;
	
	@OneToMany(mappedBy="orderForMedicine")
	private List<OrderMedicineEntity> orders = new ArrayList<OrderMedicineEntity>();
	

	
}
