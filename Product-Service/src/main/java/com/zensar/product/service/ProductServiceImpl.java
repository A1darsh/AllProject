package com.zensar.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zensar.product.entity.CouponDto;
import com.zensar.product.entity.Product;
import com.zensar.product.entity.ProductDto;
import com.zensar.product.repository.ProductRepository;
import com.zensar.product.rest.client.CouponClient;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CouponClient couponClient;
	
	/*
	 * @Autowired private RestTemplate restTemplate;
	 */
	@Override
	public ProductDto insertProduct(ProductDto productDto) {
		
		//CouponDto couponDto = restTemplate.getForObject("http://localhost:4070/coupons/coupon/"+productDto.getCode(),CouponDto.class);
		
	   //CouponDto couponDto = restTemplate.getForObject("http://COUPONSERVICE/coupons/coupon/"+productDto.getCode(),CouponDto.class);
		
		CouponDto couponDto = couponClient.getCoupon(productDto.getCode());
		productDto.setPrice(productDto.getPrice()-couponDto.getDiscount());
		
		Product map = modelMapper.map(productDto, Product.class);
		Product save = productRepository.save(map);
		return modelMapper.map(save, ProductDto.class);

	}

	@Override
	public List<ProductDto> getProduct(String token) {
		if (token.equals("am222")) {
			List<Product> findAll = productRepository.findAll();
			List<ProductDto> dto=new ArrayList<>();
			for (Product add : findAll) {
				 dto.add(modelMapper.map(add, ProductDto.class));
			}
			return dto;
		} else
			return null;
	}

	@Override
	public ProductDto updateProduct(int productId, ProductDto productDto) {
		
		Optional<Product> findById = productRepository.findById(productId);
		Product product2 = findById.get();
		ProductDto map = modelMapper.map(product2, ProductDto.class);
        
		// map.setProductId(product.getProductId());
		map.setProductName(productDto.getProductName());
		map.setDiscription(productDto.getDiscription());
		map.setPrice(productDto.getPrice());
		Product map2 = modelMapper.map(map, Product.class);
		 Product save = productRepository.save(map2);
		 ProductDto map3 = modelMapper.map(save, ProductDto.class);
	    return map3;
	}

	@Override
	public String deleteProduct(int productId) {
		productRepository.deleteById(productId);
		return "deleted successfully";
	}

}
