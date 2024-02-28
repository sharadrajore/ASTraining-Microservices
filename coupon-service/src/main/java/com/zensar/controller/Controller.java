package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.CouponDto;
import com.zensar.service.CouponService;

@RestController
@RequestMapping(value = "/coupon-api")
public class Controller {
	@Autowired
	private CouponService couponService;

	/*@GetMapping("/coupons/{couponId}")
	public ResponseEntity<CouponDto> getCoupon(@PathVariable("couponId") int couponId) {
		return new ResponseEntity<>(couponService.getCoupon(couponId),HttpStatus.OK);
	}*/
	
	@GetMapping("/coupons/{couponCode}")
	public ResponseEntity<CouponDto> getCoupon(@PathVariable("couponId") String couponCode) {
		return new ResponseEntity<>(couponService.getCoupon(couponCode),HttpStatus.OK);
	}

	@GetMapping("/coupons")
	public ResponseEntity<List<CouponDto>> getAllCoupons() {
		return new ResponseEntity<>(couponService.getAllCoupons(),HttpStatus.OK);
	}

	@PostMapping("/coupons")
	public ResponseEntity<CouponDto>insertCoupon(@RequestBody CouponDto couponDto) {
		return new ResponseEntity<>(couponService.insertCoupon(couponDto),HttpStatus.CREATED);
	}

	@PutMapping("/coupons")
	public ResponseEntity<String> updateCouponId(@PathVariable("couponId") int couponId, @RequestBody CouponDto couponDto) {
		couponService.updateCouponId(couponId, couponDto);
		return new ResponseEntity<String>("Coupon Updated SuccessFullyy..!!!", HttpStatus.OK);
		
	}

	@DeleteMapping("/coupons")
	public ResponseEntity<String> deleteCoupon(@PathVariable("coupodId") int couponId) {
		couponService.deleteCoupon(couponId);
		return new ResponseEntity<String>("Coupon Deleted Successfully..!!!", HttpStatus.OK);
	}
}
