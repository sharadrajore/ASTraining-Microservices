package com.zensar.spring_core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myproduct")


//@Controller

//@Service

//@Repository
public class Product {

	@Value("${id}")
	private int productId;

	@Value("${name}")
	private String productName;

	@Value("${cost}")
	private double productCost;

	public Product() {
		super();
		System.out.println("I am inside public Product()");
	}

	public Product(int productId, String productName, double productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		System.out.println(" I am inside public Product(int productId, String productName, double productCost)");
	}
	
	/*
	 * public Product(double productCost, String productName,int productId) {
	 * super(); this.productId = productId; this.productName = productName;
	 * this.productCost = productCost; System.out.
	 * println(" I am inside public Product(double productCost, String productName,int productId)"
	 * ); }
	 */
	
	/*
	 * public Product(String productId, String productName, String productCost) {
	 * System.out.
	 * println("I am inside public Product(String productId, String productName, String productCost)"
	 * ); }
	 */
	
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		System.out.println("I am inside public void setProductId(int productId)");
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}

}
