package com.zensar.masterdata.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.masterdata.dto.MasterDataDto;
import com.zensar.masterdata.entity.MasterData;
@Service
public interface MasterDataService {

	public MasterDataDto postNewAdvertise(MasterDataDto masterDataDto, String token);

	public MasterDataDto updateAdvertise(int id, MasterDataDto masterDataDto1, String token);

	public HashMap<String, List<MasterDataDto>> Get(String token);

	public MasterDataDto getSpecificAdvertise(int id, String token);

	public boolean deleteSpecificAdvertise(int id, String token);

	public List<MasterDataDto> searchAdvertisementsByCriteria(String searchText,String category );
	public List<MasterDataDto> searchAdvertisementsByText(String searchText);
	
	public MasterDataDto ReturnAdvertiseDetails(int postId, String token);




}
