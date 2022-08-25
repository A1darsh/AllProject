package com.zensar.spring.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zensar.spring.beans.Product;

public class ProductRepositoryImpl1 implements ProductRepository {

	private JdbcTemplate template;

	public ProductRepositoryImpl1() {

	}

	public int insertProduct(Product product) {
		// createTable();
		String sql = "insert into product values(" + product.getProductId() + ",'" + product.getProductName() + "',"
				+ product.getProductCost() + ");";
		template.execute(sql);
		return 1;
	}

	public void createTable() {
		template.execute("create table product(productId int ,productName varchar(50),productCost int)");
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int deleteProduct(Product product) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter productid");
		int id = sc.nextInt();
		String sql = "DELETE FROM product WHERE productId=" + id;
		template.execute(sql);
		return 1;
	}

	public int updateProduct(Product product) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter productid");
		int id = sc.nextInt();
		System.out.println("enter productName");
		String name = sc.next();
		System.out.println("enter productCost");
		int cost = sc.nextInt();
		String sql = "UPDATE product SET productName = '" + name + "',productCost=" + cost + " WHERE productId = " + id;

		template.execute(sql);
		return 1;
	}

	public List<Product> getAllProduct(Product product) {
		String sql = "select * from product";
		List<Product> product1 = template.query(sql, (rs, rowNum) -> new Product(rs.getInt("productId"),
				rs.getString("productName"), rs.getInt("productCost")));
		
	     
		return product1;
	}

}
