package com.zensar.coupon.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.coupon.entity.Coupon;
import com.zensar.coupon.entity.CouponDto;
import com.zensar.coupon.repository.CouponRepository;


@Service
public class CouponServiceImpl implements CouponService{

	@Autowired
	private CouponRepository couponRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<CouponDto> getAllCoupon() {
		List<Coupon> findAll = couponRepository.findAll();
		List<CouponDto> listCouponResponse = new ArrayList<CouponDto>();
		for (Coupon coupon : findAll) {
			CouponDto map = modelMapper.map(coupon, CouponDto.class);
			listCouponResponse.add(map);
		}
		return listCouponResponse;
	}

	@Override
	public CouponDto createCoupon(CouponDto coupon, String token) {
		Coupon map = modelMapper.map(coupon, Coupon.class);
		if (token.equalsIgnoreCase("am222")) {
			Coupon save = couponRepository.save(map);
			return modelMapper.map(save, CouponDto.class);
		} else
			return null;
	}

	@Override
	public CouponDto updateStock(Integer couponId, CouponDto coupon) {
		Optional<Coupon> findById = couponRepository.findById(couponId);
			Coupon coupon2 = findById.get();
		coupon2.setCouponCode(coupon.getCouponCode());
		coupon2.setDiscount(coupon.getDiscount());
		coupon2.setExpDate(coupon.getExpDate());
		return modelMapper.map(couponRepository.save(coupon2), CouponDto.class);
	}

	@Override
	public String deleteAllCoupon() {
		couponRepository.deleteAll();
		return "all stocks deleted";
	}

	@Override
	public String deleteCouponPara(Integer id) {
		couponRepository.deleteById(id);
		return "stock deleted with stock id" + id;
	}

	@Override
	public CouponDto findByCouponCode(String couponCode) {
		
		
		return modelMapper.map(couponRepository.findByCouponCode(couponCode), CouponDto.class);
	
	}

	

}
