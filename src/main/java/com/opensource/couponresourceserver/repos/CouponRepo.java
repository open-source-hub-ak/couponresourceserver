package com.opensource.couponresourceserver.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opensource.couponresourceserver.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	
	Coupon findByCode(String code);
}
