package com.pharmacyms.dto;

import java.util.List;

public class SupplierDTO {

	private long id;
	private String name;
	private String address;
	private String city;
	private String district;
	private String mobile;
	private String email;
	private List<MedicineDTO> medicines;
	
	public SupplierDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SupplierDTO(long id, String name, String address, String city, String district, String mobile, String email,
			List<MedicineDTO> medicines) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.district = district;
		this.mobile = mobile;
		this.email = email;
		this.medicines = medicines;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<MedicineDTO> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<MedicineDTO> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "SupplierDTO [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", district="
				+ district + ", mobile=" + mobile + ", email=" + email + ", medicines=" + medicines + "]";
	}
	
	
}
