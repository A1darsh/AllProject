package com.zensar.product.service;

import java.util.List;

import com.zensar.product.entity.Product;
import com.zensar.product.entity.ProductDto;



public interface ProductService {

	public ProductDto insertProduct(ProductDto productDto);
	public List<ProductDto> getProduct(String token);
	public ProductDto updateProduct(int productId, ProductDto productDto);
	public String deleteProduct(int productId);


	
	
	
	
}
