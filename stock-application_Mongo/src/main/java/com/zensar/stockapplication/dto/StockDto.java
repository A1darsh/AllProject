package com.zensar.stockapplication.dto;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class StockDto {
	
	private long stockId;
	private String name;
	private String marketName;
	private double price;

}
