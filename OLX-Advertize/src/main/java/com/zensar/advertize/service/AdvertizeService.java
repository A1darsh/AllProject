package com.zensar.advertize.service;

import java.util.HashMap;
import java.util.List;

import com.zensar.advertize.dto.CategoriesDto;
import com.zensar.advertize.dto.StatusDto;
import com.zensar.advertize.entity.Categories;
import com.zensar.advertize.entity.Status;

public interface AdvertizeService {

	public HashMap<String, List<CategoriesDto>> returnAllCategories();
	
	public HashMap<String, List<StatusDto>> returnAllStatus();
}
