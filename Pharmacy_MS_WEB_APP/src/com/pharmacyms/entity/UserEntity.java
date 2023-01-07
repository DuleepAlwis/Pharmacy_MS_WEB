package com.pharmacyms.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pharmacyms.Constants.Role;

@Entity
@Table(name="user_tb")
public class UserEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
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
	
	@OneToMany(mappedBy="userId")
	private List<OrderEntity> orders;

	
	
	
}
