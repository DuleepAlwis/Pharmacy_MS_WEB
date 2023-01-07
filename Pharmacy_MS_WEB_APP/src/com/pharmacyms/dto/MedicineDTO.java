package com.pharmacyms.dto;

import java.util.List;

public class MedicineDTO {

	private long id;
	private String name;
	private int quantity;
	private double price;
	private String image;
	private List<SupplierDTO> suppliers;
	private List<PurchaseDTO> purchases;
	private List<OrderDTO> orders;
	
	public MedicineDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicineDTO(long id, String name, int quantity, double price, String image, List<SupplierDTO> suppliers,
			List<PurchaseDTO> purchases, List<OrderDTO> orders) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.image = image;
		this.suppliers = suppliers;
		this.purchases = purchases;
		this.orders = orders;
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

	public List<SupplierDTO> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<SupplierDTO> suppliers) {
		this.suppliers = suppliers;
	}

	public List<PurchaseDTO> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<PurchaseDTO> purchases) {
		this.purchases = purchases;
	}

	public List<OrderDTO> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDTO> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "MedicineDTO [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", image="
				+ image + ", purchases=" + purchases + ", orders=" + orders + "]";
	}

	
	
}
