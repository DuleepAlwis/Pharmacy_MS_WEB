package com.pharmacyms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine_tb")
public class MedicineEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private double price;
	
	@Column(name="image")
	private String image;

	public MedicineEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicineEntity(long id, String name, int quantity, double price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.image = image;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "MedicineEntity [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ ", image=" + image + "]";
	}
	
	
}
