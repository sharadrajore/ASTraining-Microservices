package com.zensar.dto;

public class CouponDto {
	private int couponId;
	private String couponCode;
	private String couponExpiryDate;
	
	public CouponDto() {
		super();
	}

	
	public CouponDto(int couponId, String couponCode, String couponExpiryDate) {
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
		return "CouponDto [couponId=" + couponId + ", couponCode=" + couponCode + ", couponExpiryDate="
				+ couponExpiryDate + "]";
	}
	

}
