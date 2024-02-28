package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.CouponDto;
import com.zensar.entity.Coupon;
import com.zensar.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponRepository couponRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CouponDto getCoupon(int couponId) {
		Coupon coupon = couponRepository.findById(couponId).get();
		// CouponDto dto=mapToDto(coupon);
		return modelMapper.map(coupon, CouponDto.class);

	}

	@Override
	public List<CouponDto> getAllCoupons() {
		List<Coupon> listOfCoupons = couponRepository.findAll();
		List<CouponDto> listOfCouponDto = new ArrayList<CouponDto>();
		for (Coupon coupon : listOfCoupons) {
			// listOfCouponDto.add(mapToDto(coupon));
			listOfCouponDto.add(modelMapper.map(coupon, CouponDto.class));
		}
		return listOfCouponDto;
	}

	@Override
	public void updateCouponId(int couponId, CouponDto couponDto) {
		// Coupon coupon=mapToEntity(couponDto);
		Coupon coupon = modelMapper.map(couponDto, Coupon.class);
		couponRepository.save(coupon);
	}

	@Override
	public CouponDto insertCoupon(CouponDto couponDto) {
		// Coupon coupon=mapToEntity(couponDto);
		Coupon coupon = modelMapper.map(couponDto, Coupon.class);
		Coupon couponInserted = couponRepository.save(coupon);
		// CouponDto dto =mapToDto(insertedCoupon);
		return modelMapper.map(couponInserted, CouponDto.class);
		// return dto;

	}

	@Override
	public void deleteCoupon(int couponId) {
		couponRepository.deleteById(couponId);

	}

	@Override
	public CouponDto getCoupon(String couponCode) {
		Coupon coupon = couponRepository.getByCouponCode(couponCode);
		return modelMapper.map(coupon, CouponDto.class);
	}

	/*
	 * public Coupon mapToEntity(CouponDto couponDto) { Coupon coupon = new
	 * Coupon(); coupon.setCouponId(couponDto.getCouponId());
	 * coupon.setCouponCode(couponDto.getCouponCode());
	 * coupon.setCouponExpityDate(coupon.getCouponExpityDate()); return coupon; }
	 * 
	 * public CouponDto mapToDto(Coupon coupon) { CouponDto dto = new CouponDto();
	 * dto.setCouponId(coupon.getCouponId());
	 * dto.setCouponCode(coupon.getCouponCode());
	 * dto.setCouponExpityDate(coupon.getCouponExpityDate()); return dto; }
	 */

}
