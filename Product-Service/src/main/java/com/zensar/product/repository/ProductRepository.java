package com.zensar.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.product.entity.Product;
import com.zensar.product.entity.ProductDto;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>{

	

}
