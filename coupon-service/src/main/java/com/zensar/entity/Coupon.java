package com.zensar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Coupon {
	@Id
	private int couponId;
	@Column(unique = true)
	private String couponCode;
	private String couponExpiryDate;

	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponCode, String couponExpiryDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponExpiryDate = couponExpiryDate;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponExpiryDate() {
		return couponExpiryDate;
	}

	public void setCouponExpiryDate(String couponExpiryDate) {
		this.couponExpiryDate = couponExpiryDate;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponCode=" + couponCode + ", couponExpiryDate=" + couponExpiryDate
				+ "]";
	}

}
