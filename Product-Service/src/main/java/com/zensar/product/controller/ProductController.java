package com.zensar.product.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.product.entity.Product;
import com.zensar.product.entity.ProductDto;
import com.zensar.product.service.ProductService;

@RestController
//@RequestMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, consumes = {
		//MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })

@RequestMapping(value="/products")

public class ProductController {

	@Autowired
	private ProductService productService;

	
	@PostMapping("/post")
	public ProductDto insertProduct(@RequestBody ProductDto productDto) {
		 System.out.println("hi-------------");
		return productService.insertProduct(productDto);

	}

	@GetMapping("/get")
	public List<ProductDto> getProduct(@RequestHeader("auth-token") String token) {
		return productService.getProduct(token);

	}

	@PutMapping(value = "update/{productId}")
	public ProductDto updateProduct(@PathVariable int productId, @RequestBody ProductDto productDto) {
		return productService.updateProduct(productId, productDto);
	}

	@DeleteMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable int productId) {
		return productService.deleteProduct(productId);

	}

}
