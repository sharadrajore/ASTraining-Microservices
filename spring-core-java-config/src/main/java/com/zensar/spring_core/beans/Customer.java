package com.zensar.spring_core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Customer {
	@Value("${id}")
	private int customerId;
	@Value("${cname}")
	private String customerName;
	@Value("${age}")
	private double customerAge;
	
	
	@Autowired
	@Qualifier("address1")
	private IAddress address;
	
    //@Autowired
	public Customer(IAddress address) {
		super();
		this.address = address;
	}

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, double customerAge) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
	}
	
	

	public IAddress getAddress() {
		return address;
	}

	
	//@Autowired
	public void setAddress(IAddress address) {
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(double customerAge) {
		this.customerAge = customerAge;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", Iaddress=" + address + "]";
	}

	
	

}
