package com.zensar.coupon.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponDto {

	private Integer couponId;
	private String couponCode;
	private double  discount;
	private String expDate;
}
