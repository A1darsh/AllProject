package com.zensar.product.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zensar.product.entity.CouponDto;
@FeignClient("GATEWAY-SERVICE")
public interface CouponClient {

	@GetMapping("/coupons/coupon/{couponCode}")
	CouponDto getCoupon(@PathVariable("couponCode")String couponCode );
}
