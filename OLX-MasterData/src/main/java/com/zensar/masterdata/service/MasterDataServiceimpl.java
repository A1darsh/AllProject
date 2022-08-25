package com.zensar.masterdata.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zensar.masterdata.dto.MasterDataDto;
import com.zensar.masterdata.entity.MasterData;
import com.zensar.masterdata.repository.MasterDataRepository;

@Service
public class MasterDataServiceimpl implements MasterDataService {

	@Autowired
	MasterDataRepository masterDataRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public MasterDataDto postNewAdvertise(MasterDataDto masterDataDto, String token) {
		MasterData masterData = modelMapper.map(masterDataDto, MasterData.class);
		if (token.equalsIgnoreCase("am222")) {
			masterDataRepository.save(masterData);
			return modelMapper.map(masterData, MasterDataDto.class);
		} else
			return null;
	}

	@Override
	public MasterDataDto updateAdvertise(int id, MasterDataDto masterDataDto1, String token) {
		MasterDataDto masterDataDto = ReturnAdvertiseDetails(id, token);
		MasterData masterData = modelMapper.map(masterDataDto, MasterData.class);
		masterData.setTitle(masterDataDto1.getTitle());
		masterData.setPrice(masterDataDto1.getPrice());
		// map.setId(masterDataDto1.getStatusId());
		masterData.setDescription(masterDataDto1.getDescription());
		return modelMapper.map(masterDataRepository.save(masterData), MasterDataDto.class);

	}

	@Override
	public HashMap<String, List<MasterDataDto>> Get(String token) {
		
		HashMap<String, List<MasterDataDto>> map1 = new HashMap<>();
		
		if (token.equals("am222")) {
			List<MasterData> data = masterDataRepository.findAll();
			List<MasterDataDto> masterDataDto = new ArrayList<>();
			for (MasterData md : data) {
				masterDataDto.add(modelMapper.map(md, MasterDataDto.class));
				map1.put("advertises", masterDataDto);
			}
			return map1;
		} else {
			return null;
		}
	}

	@Override
	public MasterDataDto getSpecificAdvertise(int id, String token) {
		if (token.equals("am222")) {
			MasterData masterData = masterDataRepository.getById(id);
			MasterDataDto materDataDto = modelMapper.map(masterData, MasterDataDto.class);
			return materDataDto;
		}
		return null;
	}

	@Override
	public boolean deleteSpecificAdvertise(int id, String token) {
		if (token.equals("am222")) {
			masterDataRepository.deleteById(id);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public List<MasterDataDto> searchAdvertisementsByCriteria(String searchText, String category) {

		List<MasterData> masterData = masterDataRepository.searchByFilterCriteria(searchText, category);
		List<MasterDataDto> masterDataDto = new ArrayList<MasterDataDto>();
		for (MasterData md : masterData)
			masterDataDto.add(modelMapper.map(md, MasterDataDto.class));
		return masterDataDto;

	}

	@Override
	public List<MasterDataDto> searchAdvertisementsByText(String searchText) {

		List<MasterData> masterData = masterDataRepository.searchByText(searchText);
		List<MasterDataDto> masterDataDto = new ArrayList<MasterDataDto>();
		for (MasterData md : masterData)
			masterDataDto.add(modelMapper.map(md, MasterDataDto.class));
		return masterDataDto;
	}

	@Override
	public MasterDataDto ReturnAdvertiseDetails(int postId, String token) {
		if (token.equals("am222")) {
			MasterData masterData = masterDataRepository.getById(postId);
			MasterDataDto materDataDto = modelMapper.map(masterData, MasterDataDto.class);
			return materDataDto;
		}
		return null;
	}
      
	
}

/*
 * static List<MasterData> data = new ArrayList<MasterData>(); static {
 * data.add(new MasterData(1, "laptop sale", 54000, "Electronic goods",
 * "intel core 3 Sony Vaio", "anand", 2020, 2022, "OPEN"));
 * 
 * }
 */
/*
 * static { data.add(new MasterData(2, "Sofa available for sale", 30000,
 * "Furniture", "Sofa 5 years old available for Sale in Pune", "anand", 2020,
 * 2022, "OPEN")); }
 */
/*
 * List<MasterData> data = masterDataRepository.findAll(); List<MasterDataDto>
 * masterDataDto=new ArrayList<>(); for (MasterData md : data) {
 * masterDataDto.add(modelMapper.map(md, MasterDataDto.class)); } if
 * (token.equals("am222")) {
 * 
 * for(MasterDataDto mdDto: masterDataDto ) { if(mdDto.getId()==id) { return
 * mdDto; } } } return null; }
 */
/*
 * for (MasterData Data : data) { if (Data.getId() == id) { data.remove(Data);
 * return true;}
 */
/*
 * Optional<MasterData> findAny = data.stream().filter(MasterData ->
 * MasterData.getId() == id).findAny();
 * 
 * if (findAny.isPresent()) { MasterData MasterData = findAny.get();
 * data.remove(MasterData); return true; } } else return false; return false;
 */
/*
 * @Override public List<MasterData> getStockItsName(String MasterName) {
 * List<MasterData> findStockByName = masterDataRepository.asd(MasterName);
 * 
 * // List<MasterData> data = new ArrayList<MasterData>();
 * 
 * for (MasterData st : findStockByName) { stockDto.add(modelMapper.map(st,
 * StockDto.class));}
 * 
 * return findStockByName; }
 */
//List<MasterData> data = masterDataRepository.findAll();
/*
 * for (MasterData Data : data) { if (Data.getCategory() == category) {
 * List<MasterData> findStockBycategory = masterDataRepository.asd(category);
 * //List<MasterData> data1 = masterDataRepository.findAll(Sort.by(sortby));
 * return findStockBycategory; } } return null;
 */