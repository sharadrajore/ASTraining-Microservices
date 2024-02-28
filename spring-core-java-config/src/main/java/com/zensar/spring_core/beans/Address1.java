package com.zensar.spring_core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address1 implements IAddress{
	@Value("${state}")
	private String state;
	@Value("${city}")
	private String city;
	@Value("${pinCode}")
	private int pinCode;
	
	

	public Address1() {
		super();
	}

	public Address1(String state, String city, int pinCode) {
		super();
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address 1 [state=" + state + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	

}
