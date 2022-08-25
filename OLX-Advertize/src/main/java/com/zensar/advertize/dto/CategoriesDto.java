package com.zensar.advertize.dto;

import com.zensar.advertize.entity.Categories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriesDto {

	private int id;
	private String category;
	
}
