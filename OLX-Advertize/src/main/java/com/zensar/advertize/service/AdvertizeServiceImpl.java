package com.zensar.advertize.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.advertize.dto.CategoriesDto;
import com.zensar.advertize.dto.StatusDto;
import com.zensar.advertize.entity.Categories;
import com.zensar.advertize.entity.Status;
import com.zensar.advertize.repository.AdvetiseRepository;
import com.zensar.advertize.repository.StatusRepository;

@Service
public class AdvertizeServiceImpl implements AdvertizeService {

	@Autowired
	AdvetiseRepository advetiseRepository;
	@Autowired
	StatusRepository statusRepository;

	@Autowired
	private ModelMapper modelMapper;

	HashMap<String, List<CategoriesDto>> map1 = new HashMap<>();

	@Override
	public HashMap<String, List<CategoriesDto>> returnAllCategories() {
		List<Categories> data = advetiseRepository.findAll();
		List<CategoriesDto> dto = new ArrayList<>();
		for (Categories cat : data) {
			dto.add(modelMapper.map(cat, CategoriesDto.class));
		}
		map1.put("Categories", dto);
		return map1;

	}

	HashMap<String, List<StatusDto>> map2 = new HashMap<>();

	@Override
	public HashMap<String, List<StatusDto>> returnAllStatus() {
		List<Status> data1 = statusRepository.findAll();
		List<StatusDto> statusDto = new ArrayList<>();
		for (Status st : data1) {
			statusDto.add(modelMapper.map(st, StatusDto.class));
		}
		map2.put("statusList", statusDto);
		return map2;

	}

}
//HashMap<String, List<Categories>> map1 = new HashMap<>();
/*
 * List<Categories>>(); static List<Categories> cat = new
 * ArrayList<Categories>();
 * 
 * static { cat.add(new Categories(1, "Furniture")); cat.add(new Categories(2,
 * "cars")); cat.add(new Categories(3, "Mobiles")); cat.add(new Categories(4,
 * "Real Estate")); cat.add(new Categories(5, "Sports")); }
 */
/*
 * static List<Status> status = new ArrayList<Status>();
 * 
 * static { status.add(new Status(1, "Open")); status.add(new Status(2,
 * "Closed"));
 * 
 * }
 */
