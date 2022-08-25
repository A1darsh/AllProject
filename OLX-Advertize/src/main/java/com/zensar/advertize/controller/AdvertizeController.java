package com.zensar.advertize.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.advertize.dto.CategoriesDto;
import com.zensar.advertize.dto.StatusDto;
import com.zensar.advertize.entity.Categories;
import com.zensar.advertize.entity.Status;
import com.zensar.advertize.service.AdvertizeService;

@RestController
@RequestMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, consumes = {
		MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
public class AdvertizeController {

	@Autowired
	private AdvertizeService advertizeService;

	@GetMapping(value = "/advertise/category")
	public HashMap<String, List<CategoriesDto>> returnAllCategories() {
		return advertizeService.returnAllCategories();
	}

	@GetMapping(value = "/advertise/status")
	public HashMap<String, List<StatusDto>> returnAllStatus() {
		return advertizeService.returnAllStatus();
	}

}
