package com.Relational.Mapping.Include.Filter.RelationalMapFilter.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class BusDetailsDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busDetailsNo;
	
	private String nameOfBus;
	
	private String busDriverName;

	private String busConductor;

}
