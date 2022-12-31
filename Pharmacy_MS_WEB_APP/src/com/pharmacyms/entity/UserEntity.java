package com.pharmacyms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.pharmacyms.Constants.Role;

@Entity
@Table(name="user_tb")
public class UserEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobileno")
	private String mobileno;
	
	@Column(name="otp")
	private String otp;
	
	@Column(name="role")
	private Role role;

	public UserEntity(long id, String username, String password, String email, String mobileno, String otp, Role role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobileno = mobileno;
		this.otp = otp;
		this.role = role;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", mobileno=" + mobileno + ", otp=" + otp + ", role=" + role + "]";
	}
	
	
}
