package com.Relational.Mapping.Include.Filter.RelationalMapFilter.dto;

import com.Relational.Mapping.Include.Filter.RelationalMapFilter.entity.BusDetails;

import lombok.Data;

@Data
public class PrivateBusDto {
	
    private int busNo;
	
	private String busName;
	
	private String busRoot;
	
	private BusDetails busDetails;

}
