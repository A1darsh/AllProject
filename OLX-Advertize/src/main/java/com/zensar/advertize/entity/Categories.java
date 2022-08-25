package com.zensar.advertize.entity;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Advertise")
@Table(name="data")
public class Categories {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String category;
	
	
}
