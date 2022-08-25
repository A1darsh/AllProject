package com.zensar.stockapplication.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.stockapplication.dto.StockDto;
import com.zensar.stockapplication.entity.Stock;
//import com.zensar.stockapplication.entity.StockRequest;
//import com.zensar.stockapplication.entity.StockResponse;
//import com.zensar.stockapplication.service.StockService;
import com.zensar.stockapplication.service.StockService;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import io.swagger.annotations.ApiResponse;

//@Controller
@RestController
//@CrossOrigin("http://localhost:4200")
//@RequestMapping(value="/stocks",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
@RequestMapping(value = "/stocks")
//@Api(value = "this is stock controller")

public class StockController {

	@Autowired
	private StockService stockService;

	// http://localhost:4040/stocks/test
	// http://localhost:4040/test

	/*
	 * @RequestMapping(value = "/test", method = { RequestMethod.GET,
	 * RequestMethod.POST }) public void test() {
	 * System.out.println("i am inside the method"); }
	 */
	/*
	 * public StockController() { stocks.add(new Stock(1L, "RIL","bse", 2610));
	 * stocks.add(new Stock(2L, "zensar","bse", 342));
	 * 
	 * }
	 */

	/*
	 * @GetMapping("/stocks") public List<Stock> getAllStock() { return stocks; }
	 */

	// get all stocks
	// @RequestMapping(method = RequestMethod.GET)
	// @ResponseBody
	@GetMapping()
	//@ApiOperation(value = "getting all stock informationk")
	public List<StockDto> getAllStock(@RequestParam(value="pageNumber",defaultValue="0",required=false)int pageNumber,@RequestParam(value="pageSize",defaultValue="5",required=false) int pageSize,@RequestParam(value="sortby",defaultValue="stockId",required=false) String sortby) {
		//System.out.println(pageSize);
		
		return stockService.getAllStock(pageNumber ,pageSize,sortby);
	
	}

	// get specific stock

	// @GetMapping("/{stockId}")
	/*
	 * @RequestMapping(value = "/stocks/{stockId}") public Stock
	 * getStock1(@PathVariable("stockId") long id) { for (Stock stock : stocks) { if
	 * (stock.getStockId() == id) { return stock; } } return null; }
	 */

	/*@GetMapping("/name/{stockName}/price/{stockPrice}")
	public List<StockDto> getStockByName(@PathVariable("stockName")String stockName ,@PathVariable("stockPrice") double stockPrice){
		
		return stockService.getStockItsNameAndPrice(stockName,stockPrice);
	}
	
	
	@GetMapping("/name/{stockName}")
	public List<StockDto> getStockByName(@PathVariable("stockName")String stockName){
		
		return stockService.getStockItsName(stockName);
	}*/
	
	
	@GetMapping("/{stockId}")
	// @RequestMapping(value = "/{stockId}")
	//@ApiOperation(value = "getting stock based in stock id")
	//@ApiResponse(message = "got stock based on id", code = 200)
	public StockDto getStock(@PathVariable("stockId") long id) {
		return stockService.getStock(id);

	}

	// @GetMapping("/stocks")
	/*
	 * @RequestMapping(value="/stocks",method=RequestMethod.GET) public Stock
	 * getStock(@RequestParam(required=false ,value="id",defaultValue="2" )long id)
	 * { for (Stock stock : stocks) { if (stock.getStockId() == id) { return stock;
	 * } } return null; }
	 */

	// @PostMapping("/stocks")
	// @RequestMapping(method = RequestMethod.POST)

	@PostMapping()
	public ResponseEntity<Stock> createStock(@RequestBody StockDto stock, @RequestHeader("auth-token") String token) {
		StockDto createStock = stockService.createStock(stock, token);
		if (createStock == null)
			return new ResponseEntity<Stock>(HttpStatus.BAD_REQUEST);
		else
			return new ResponseEntity<Stock>(HttpStatus.CREATED);
	}

	// delete specific stock
	@DeleteMapping("/{stockId}")
	public String deleteStock(@PathVariable("stockId") long stockId) {
		return stockService.deleteStock(stockId);
	}

	// update stock
	@PutMapping(value = "/{stockId}")
	public StockDto updateStock(@PathVariable int stockId, @RequestBody StockDto stock) {
		return stockService.updateStock(stockId, stock);
	}

	// delete all stock

	@DeleteMapping
	public ResponseEntity<String> deleteAllStock() {
		String returnResult = stockService.deleteAllStocks();

		return new ResponseEntity<String>(returnResult, HttpStatus.OK);
	}

}
