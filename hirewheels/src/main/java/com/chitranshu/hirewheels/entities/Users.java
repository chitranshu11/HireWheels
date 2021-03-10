package com.chitranshu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Users {
	
	@Id
	private long userId;
	
	@Column(length = 50, nullable = false)
	private String  firstName;

	@Column(length = 50)
	private String lastName;
	
	@Column(length = 50, nullable = false)
	private String password;
	
	@Column(length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(length = 10, nullable = false, unique = true)
	private String mobileNo;
	
	@Column(nullable = false)
	private long roleId;
	
	@Column(columnDefinition="Numeric(10,2) default '10000.00'")
	private double walletMoney;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public double getWalletMoney() {
		return walletMoney;
	}

	public void setWalletMoney(double walletMoney) {
		this.walletMoney = walletMoney;
	}
	
	
}
