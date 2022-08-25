package com.zensar.masterdata;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.zensar.masterdata.entity.MasterData;

@SpringBootApplication 
public class OlxMasterDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxMasterDataApplication.class, args);
		MasterData masterData=new MasterData();
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
