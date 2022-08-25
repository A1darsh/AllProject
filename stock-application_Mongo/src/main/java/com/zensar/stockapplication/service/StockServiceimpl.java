package com.zensar.stockapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zensar.stockapplication.dto.StockDto;
import com.zensar.stockapplication.entity.Stock;
//import com.zensar.stockapplication.entity.StockRequest;
//import com.zensar.stockapplication.entity.StockResponse;
//import com.zensar.stockapplication.repository.StockRepository;
import com.zensar.stockapplication.repository.StockRepository;

@Service
public class StockServiceimpl implements StockService {

	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private ModelMapper modelMapper;
	// private ModelMapper modelMapper = new ModelMapper();

	// static List<Stock> stocks = new ArrayList<Stock>();

	/*
	 * static { stocks.add(new Stock(1L, "RIL", "bse", 2610)); stocks.add(new
	 * Stock(2L, "zensar", "bse", 342)); }
	 */
	@Override
	public List<StockDto> getAllStock(int pageNumber, int pageSize, String sortby) {

		Page<Stock> pageStock = stockRepository.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(sortby)));

		List<Stock> content = pageStock.getContent();

		List<StockDto> stockDto = new ArrayList<>();

		for (Stock stock : content) {
			StockDto map = modelMapper.map(stock, StockDto.class);
			stockDto.add(map);
		}

		return stockDto;

	}

	/*@Override
	public List<StockDto> getStockItsName(String stockName) {
		List<Stock> findStockByName = stockRepository.asd(stockName);

		List<StockDto> stockDto = new ArrayList<StockDto>();
		for (Stock st : findStockByName) {
			stockDto.add(modelMapper.map(st, StockDto.class));
		}
		return stockDto;
	}

	public List<StockDto> getStockItsNameAndPrice(String stockName, double stockPrice) {
		List<Stock> findStockByNameAndPrice = stockRepository.findStockByNameAndPrice(stockName, stockPrice);

		List<StockDto> stocks = new ArrayList<StockDto>();
		for (Stock st : findStockByNameAndPrice) {
			stocks.add(modelMapper.map(st, StockDto.class));
		}
		return stocks;

	}*/

	@Override
	public StockDto getStock(long id) {

		Stock stock = stockRepository.findById(id).get();
		/*
		 * StockResponse stockResponse = new StockResponse();
		 * stockResponse.setStockId(stock.getStockId());
		 * stockResponse.setName(stock.getName());
		 * stockResponse.setPrice(stock.getPrice());
		 * stockResponse.setMarketName(stock.getMarketName());
		 */

		return modelMapper.map(stock, StockDto.class);

		// return stockResponse;

		// return stockRepository.findById(id).get();
		/*
		 * Optional<Stock> optStock=stockRepository.findById(id);
		 * if(optStock.isPresent()) { return optStock.get(); }else { return
		 * optStock.orElseGet(() ->{ return new Stock(); }); }
		 */

		/*
		 * Optional<Stock> stock1 = stocks.stream().filter(stock -> stock.getStockId()
		 * == id).findAny();
		 * 
		 * if (stock1.isPresent()) { return stock1.get(); } else { return
		 * stock1.orElseGet(() -> { return new Stock(); }); }
		 */
	}

	@Override
	public StockDto createStock(StockDto stockRequest, String token) {

		// Stock newStock = mapToStock(stock);

		Stock newStock = modelMapper.map(stockRequest, Stock.class);
		// return stockRepository.save(stock);

		if (token.equals("am222")) {
			Stock save = stockRepository.save(newStock);
			return modelMapper.map(save, StockDto.class);

		} else {
			return null;
		}

	}

	@Override
	public String deleteStock(long stockId) {

		stockRepository.deleteById(stockId);
		return "stock deleted with stock id" + stockId;

		/*
		 * for (Stock stock : stocks) { if (stock.getStockId() == stockId) {
		 * stocks.remove(stock); return "stock deleted with stock id" + stockId; } }
		 * return "sorry ,stock id is not avilable";
		 */

	}

	@Override
	public StockDto updateStock(int stockId, StockDto stock) {

		StockDto stockDto = getStock(stockId);
		Stock stock2 = modelMapper.map(stockDto, Stock.class);
		
		
		//Stock stock2 = mapToDto(stockDto);
		
		stock2.setPrice(stock.getPrice());
		stock2.setName(stock.getName());
		stock2.setMarketName(stock.getMarketName());
		stock2.setStockId(stock.getStockId());
        
		Stock stock3=stockRepository.save(stock2);
		return modelMapper.map(stock3 , StockDto.class);
		
		
		
		/*
		 * if (stock2 != null) { stock2.setPrice(stock.getPrice());
		 * stock2.setName(stock.getName()); stock2.setMarketName(stock.getMarketName());
		 * stock2.setStockId(stockId); Stock stock3 = stockRepository.save(stock2);
		 * return mapToResponse(stock3);
		 * 
		 * }
		 * 
		 * return null;
		 * 
		 */

	}

	/*
	 * Stock mapToStock=mapToStock(stock);
	 * 
	 * Stock stock2=getStock(stockId);
	 * 
	 * Stock mapToStock2=mapToStock(stock2);
	 * mapToStock2.setMarketName(mapToStock.getMarketName());
	 * mapToStock2.setName(mapToStock.getName());
	 * mapToStock2.setPrice(mapToStock.getPrice());
	 * 
	 * return stockRepository.save(stock2);
	 * 
	 */

	// Stock availableStock = getStock(stockId);
	// return stockRepository.save(stock);

	/*
	 * availableStock.setMarketName(stock.getMarketName());
	 * availableStock.setName(stock.getName());
	 * availableStock.setPrice(stock.getPrice());
	 * 
	 * return availableStock;
	 */

	@Override
	public String deleteAllStocks() {
		stockRepository.deleteAll();
		// stocks.removeAll(stocks);
		return "All stocks are deleted successfullyyyy";
	}

	/*private Stock mapToDto(StockDto stockDto) {

		Stock newStock = new Stock();

		newStock.setMarketName(stockDto.getMarketName());
		newStock.setName(stockDto.getName());
		newStock.setPrice(stockDto.getPrice());

		return newStock;

	}*/

	/*
	 * private Stock mapToDto(StockDto stockResponse) {
	 * 
	 * Stock newStock = new Stock();
	 * 
	 * newStock.setMarketName(stockResponse.getMarketName());
	 * newStock.setName(stockResponse.getName());
	 * newStock.setPrice(stockResponse.getPrice());
	 * 
	 * return newStock;
	 * 
	 * }
	 */

	/*
	 * private StockDto mapToDto(Stock stock) {
	 * 
	 * StockDto stockResponse = new StockDto();
	 * 
	 * stockResponse.setStockId(stock.getStockId());
	 * 
	 * stockResponse.setPrice(stock.getPrice());
	 * 
	 * stockResponse.setName(stock.getName());
	 * 
	 * stockResponse.setMarketName(stock.getMarketName());
	 * 
	 * return stockResponse;
	 * 
	 * }
	 */

}
