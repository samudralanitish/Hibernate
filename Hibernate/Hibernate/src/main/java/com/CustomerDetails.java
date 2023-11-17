package com;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customerdetails")
public class CustomerDetails {
	@Id
	@Column(name="custdeId")
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private int phone;
	
	@OneToOne(mappedBy = "customerDetails", cascade = CascadeType.ALL)
	private Customer customer;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public CustomerDetails(int id, String email, int phone) {
		super();
		this.id = id;
		this.email = email;
		this.phone = phone;
	}
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
	
}
