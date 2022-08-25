package com.zensar.advertize.entity;

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
@Entity(name="Status")
@Table(name="status")
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String status;
}
