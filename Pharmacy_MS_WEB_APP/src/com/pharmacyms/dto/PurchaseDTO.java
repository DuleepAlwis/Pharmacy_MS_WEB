package com.pharmacyms.dto;

import java.util.List;

import com.pharmacyms.Constants.PurchaseType;

public class PurchaseDTO {

	private long id;
	private int quantity;
	private double price;
	private double discount;
	private double total_price;
	private PurchaseType type;
	private boolean received;
	private OrderDTO order;
	private List<MedicineDTO> medicines;
	
	public PurchaseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PurchaseDTO(long id, int quantity, double price, double discount, double total_price, PurchaseType type,
			boolean received, OrderDTO order, List<MedicineDTO> medicines) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
		this.total_price = total_price;
		this.type = type;
		this.received = received;
		this.order = order;
		this.medicines = medicines;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public PurchaseType getType() {
		return type;
	}

	public void setType(PurchaseType type) {
		this.type = type;
	}

	public boolean isReceived() {
		return received;
	}

	public void setReceived(boolean received) {
		this.received = received;
	}

	public OrderDTO getOrder() {
		return order;
	}

	public void setOrder(OrderDTO order) {
		this.order = order;
	}

	public List<MedicineDTO> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<MedicineDTO> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "PurchaseDTO [id=" + id + ", quantity=" + quantity + ", price=" + price + ", discount=" + discount
				+ ", total_price=" + total_price + ", type=" + type + ", received=" + received + ", order=" + order
				+ ", medicines=" + medicines + "]";
	}
	
	
	
}
