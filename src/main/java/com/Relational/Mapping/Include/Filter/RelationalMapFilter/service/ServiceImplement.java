package com.Relational.Mapping.Include.Filter.RelationalMapFilter.service;

import java.util.List;

import com.Relational.Mapping.Include.Filter.RelationalMapFilter.dto.PrivateBusDto;

public interface ServiceImplement {

	PrivateBusDto post(PrivateBusDto busDto);

	List<PrivateBusDto> postall(List<PrivateBusDto> busDto);

	PrivateBusDto get(int busNo);

	List<PrivateBusDto> getall();

	PrivateBusDto update(PrivateBusDto busDto);

	String delete(int busDetailsNo);

	

	
	



	

}
