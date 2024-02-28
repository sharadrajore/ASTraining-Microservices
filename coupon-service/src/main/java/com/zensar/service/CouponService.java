package com.zensar.service;

import java.util.List;

import com.zensar.dto.CouponDto;

public interface CouponService {
	
	public CouponDto getCoupon(int couponId);
	public CouponDto getCoupon(String couponCode);
	public List<CouponDto> getAllCoupons();
	public void updateCouponId(int couponId, CouponDto couponDto);
	public CouponDto insertCoupon(CouponDto couponDto);
	public void deleteCoupon(int couponId);
	
}
