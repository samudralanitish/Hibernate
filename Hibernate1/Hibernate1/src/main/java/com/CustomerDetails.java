package com;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerDetails {
	@Id
	private int custid;
	private String custemail;
	private String custcity;
	
	@OneToOne(mappedBy = "customerdetails", cascade = CascadeType.ALL)
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	public String getCustcity() {
		return custcity;
	}
	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}
	public CustomerDetails(int custid, String custemail, String custcity) {
		super();
		this.custid = custid;
		this.custemail = custemail;
		this.custcity = custcity;
	}
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerDetails [custid=" + custid + ", custemail=" + custemail + ", custcity=" + custcity + "]";
	}
	
}
