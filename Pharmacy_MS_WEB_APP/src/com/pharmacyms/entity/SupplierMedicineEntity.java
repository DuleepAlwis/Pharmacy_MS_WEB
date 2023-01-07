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
@Table(name="supplier_medicine_tb")
public class SupplierMedicineEntity {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="supplier_medicine_id")
	private long supplier_medicine_id;
	
	@Column(name="date_supplied")
	private Date date_supplied;
	
	@Column(name="units")
	private int units;
	
	@Column(name="amount_cost")
	private double amount_cost;
	
	@ManyToOne(targetEntity = com.pharmacyms.entity.SupplierEntity.class)
	@JoinColumn(name="supplier_id_fk",nullable=false)
	private SupplierEntity suppliedBy;
	
	@ManyToOne(targetEntity = com.pharmacyms.entity.MedicineEntity.class)
	@JoinColumn(name="medicine_id_fk",nullable=false)
	private MedicineEntity medicineId;
}
