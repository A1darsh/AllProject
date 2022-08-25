package com.zensar.masterdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zensar.masterdata.entity.MasterData;

@Repository
public interface MasterDataRepository extends JpaRepository<MasterData, Integer> {

	@Query(value = "SELECT * FROM Master WHERE category LIKE %:searchByText% or description LIKE"
			+ " %:searchByText% or status LIKE %:searchByText% or title LIKE %:searchByText% or username"
			+ " LIKE %:searchByText%", nativeQuery = true)
	List<MasterData> searchByText(@Param("searchByText")String searchText);

	@Query(value = "SELECT * FROM Master WHERE category LIKE %:search% or description LIKE"
			+ " %:search% or status LIKE %:search% or title LIKE %:search% or username"
			+ " LIKE %:search% or category LIKE %:categorys%", nativeQuery = true)
	List<MasterData> searchByFilterCriteria(@Param("search")String searchText,@Param("categorys")String category);

}
