package com.zensar.stockapplication.repository;

import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.zensar.stockapplication.entity.Stock;

public interface StockRepository extends MongoRepository<Stock, Long>{

	//@Query(value="select * from stock where name=:name", nativeQuery=true)
	
	
	//List<Stock> asd(@Param("name") String name);
	//@Query(value="select * from stock where name=:StockName and price=:StockPrice",nativeQuery=true)
	//List<Stock> findStockByNameAndPrice(@Param("StockName") String name, @Param("StockPrice") double stockPrice);
	
}
