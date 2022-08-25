package com.zensar.masterdata.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.masterdata.dto.MasterDataDto;
import com.zensar.masterdata.entity.MasterData;
import com.zensar.masterdata.service.MasterDataService;

@RestController
@RequestMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, consumes = {
		MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
public class MasterController {
	@Autowired
	private MasterDataService masterDataService;

	@PostMapping(value = "/advertise")
	public MasterDataDto postNewAdvertise(@RequestBody MasterDataDto masterDataDto,
			@RequestHeader("auth-token") String token) {
		return masterDataService.postNewAdvertise(masterDataDto, token);
	}

	@PutMapping(value = "/advertise/{id}")
	public MasterDataDto updateAdvertise(@PathVariable int id, @RequestBody MasterDataDto masterDataDto1,
			@RequestHeader("auth-token") String token) {
		return masterDataService.updateAdvertise(id, masterDataDto1, token);
	}

	@GetMapping(value = "/user/advertise")
	public HashMap<String, List<MasterDataDto>> Get(@RequestHeader("auth-token") String token) {
		return masterDataService.Get(token);
	}

	@GetMapping(value = "/user/advertise/{id}")
	public MasterDataDto getSpecificAdvertise(@PathVariable int id, @RequestHeader("auth-token") String token) {
		return masterDataService.getSpecificAdvertise(id, token);
	}

	@DeleteMapping("/user/advertise/{id}")
	public boolean deleteSpecificAdvertise(@PathVariable int id, @RequestHeader("auth-token") String token) {
		return masterDataService.deleteSpecificAdvertise(id, token);
	}

	@GetMapping(value = "/advertise/search/{filtercriteria}")
	public List<MasterDataDto> searchAdvertisementsByCriteria(@PathVariable("filtercriteria") String searchText,String category) {
		return masterDataService.searchAdvertisementsByCriteria(searchText,category);
	}

	@GetMapping(value = "/advertise/search")
	public List<MasterDataDto> searchAdvertisementsByText(@PathVariable String searchText) {
		return masterDataService.searchAdvertisementsByText(searchText);
	}

	@GetMapping(value = "/advertise/{postId}")
	public MasterDataDto ReturnAdvertiseDetails(@PathVariable int postId, @RequestHeader("auth-token") String token) {
		return masterDataService.ReturnAdvertiseDetails(postId, token);
	}
}
