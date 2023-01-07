package com.pharmacyms.dto;

import java.util.List;

public class OrderDTO {

	private long id;
	private String code;
	private String address;
	private String city;
	private String district;
	private String mobile;
	private UserDTO user;
	private PurchaseDTO purchase;
	private List<MedicineDTO> medicines;
	
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDTO(long id, String code, String address, String city, String district, String mobile, UserDTO user,
			PurchaseDTO purchase, List<MedicineDTO> medicines) {
		super();
		this.id = id;
		this.code = code;
		this.address = address;
		this.city = city;
		this.district = district;
		this.mobile = mobile;
		this.user = user;
		this.purchase = purchase;
		this.medicines = medicines;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public PurchaseDTO getPurchase() {
		return purchase;
	}

	public void setPurchase(PurchaseDTO purchase) {
		this.purchase = purchase;
	}

	public List<MedicineDTO> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<MedicineDTO> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", code=" + code + ", address=" + address + ", city=" + city + ", district="
				+ district + ", mobile=" + mobile + "]";
	}
	
	
}
