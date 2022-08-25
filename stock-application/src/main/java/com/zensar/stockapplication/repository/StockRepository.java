package com.zensar.stockapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.stockapplication.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{

	@Query(value="select * from stock where name=:name", nativeQuery=true)
	
	
	List<Stock> asd(@Param("name") String name);
	@Query(value="select * from stock where name=:StockName and price=:StockPrice",nativeQuery=true)
	List<Stock> findStockByNameAndPrice(@Param("StockName") String name, @Param("StockPrice") double stockPrice);
	
	
}
