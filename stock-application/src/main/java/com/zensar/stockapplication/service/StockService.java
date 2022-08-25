package com.zensar.stockapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.zensar.stockapplication.dto.StockDto;
import com.zensar.stockapplication.entity.Stock;
//import com.zensar.stockapplication.entity.StockRequest;
//import com.zensar.stockapplication.entity.StockResponse;
import com.zensar.stockapplication.exceptions.InvalidStockIdException;

public interface StockService {

	List<StockDto> getAllStock(int pageNumber,int pageSize,String sortby);
	StockDto getStock(long id) throws InvalidStockIdException;
	StockDto createStock(StockDto stock,String token);
	String deleteStock(long stockId);

	StockDto updateStock(int stockId,StockDto stock)throws InvalidStockIdException;
	String deleteAllStocks();
	
	List<StockDto> getStockItsName(String stockName);
	List<StockDto> getStockItsNameAndPrice(String stockName, double stockPrice);
	

}
