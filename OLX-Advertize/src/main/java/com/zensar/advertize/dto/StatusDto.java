package com.zensar.advertize.dto;

import com.zensar.advertize.entity.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusDto {

	private int id;
	private String status;
}
