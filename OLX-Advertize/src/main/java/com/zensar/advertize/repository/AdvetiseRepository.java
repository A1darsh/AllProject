package com.zensar.advertize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.zensar.advertize.entity.Categories;

@Service
public interface AdvetiseRepository extends JpaRepository<Categories,Integer>{

	
}
