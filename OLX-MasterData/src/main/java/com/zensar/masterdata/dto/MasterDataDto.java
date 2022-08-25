package com.zensar.masterdata.dto;

import com.zensar.masterdata.entity.MasterData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MasterDataDto {

	public int id;
	private String title;
	private int price;
	private String category;
	private String description;
	private String userName;
	private int createdDate;
	private int modifiedDate;
	private String status;
}
