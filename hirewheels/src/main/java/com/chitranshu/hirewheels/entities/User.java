package com.chitranshu.hirewheels.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	
	@Column(columnDefinition="Numeric(10,2) default '10000.00'")
	private double walletMoney;
	
	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false)
	private UserRole userRole;
	
	 @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
	 private Set<Booking> bookings;

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


	public double getWalletMoney() {
		return walletMoney;
	}

	public void setWalletMoney(double walletMoney) {
		this.walletMoney = walletMoney;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}
	
	
}
