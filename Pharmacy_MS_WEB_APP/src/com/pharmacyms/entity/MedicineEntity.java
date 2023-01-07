package com.pharmacyms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="medicine_tb")
public class MedicineEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="medicine_id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private double price;
	
	@Column(name="image")
	private String image;

	/* Related to supplier_medicine_tb*/
	@OneToMany(mappedBy="medicineId")
	private List<SupplierMedicineEntity> suppliers = new ArrayList<SupplierMedicineEntity>();
	
	/*Related to purchase_medicine_tb*/
	@OneToMany(mappedBy="purchasedMedidcineId")
	private List<PurchaseMedicineEntity> medicinePurchases = new ArrayList<PurchaseMedicineEntity>();
	
	/*Related to order_medicine_tb*/
	@OneToMany(mappedBy="medicineInOrders")
	private List<OrderMedicineEntity> medicineOrders = new ArrayList<OrderMedicineEntity>();
}
