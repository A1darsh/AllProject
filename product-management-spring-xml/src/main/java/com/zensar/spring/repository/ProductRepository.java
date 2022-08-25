package com.zensar.spring.repository;

import java.util.List;

import com.zensar.spring.beans.Product;

public interface ProductRepository {

	public int insertProduct(Product product);
	public int deleteProduct(Product product);
	public int updateProduct(Product product);
	public List<Product> getAllProduct(Product product);
}
