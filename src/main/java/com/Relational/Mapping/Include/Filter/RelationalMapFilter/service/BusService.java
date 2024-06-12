package com.Relational.Mapping.Include.Filter.RelationalMapFilter.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Relational.Mapping.Include.Filter.RelationalMapFilter.dto.PrivateBusDto;
import com.Relational.Mapping.Include.Filter.RelationalMapFilter.entity.PrivateBus;
import com.Relational.Mapping.Include.Filter.RelationalMapFilter.repository.BusRepository;

@Service
public class BusService implements ServiceImplement {

	@Autowired
	private BusRepository repository;

	@Override
	public PrivateBusDto post(PrivateBusDto busDto) {
		PrivateBus bus = new PrivateBus();
		bus.setBusNo(busDto.getBusNo());
		bus.setBusName(busDto.getBusName());
		bus.setBusRoot(busDto.getBusRoot());
		bus.setBusDetails(busDto.getBusDetails());
		repository.save(bus);
		return busDto;
	}

	@Override
	public List<PrivateBusDto> postall(List<PrivateBusDto> busDto) {
		List<PrivateBus> bus = new ArrayList<PrivateBus>();
		for (PrivateBusDto dto : busDto) {
			PrivateBus buss = new PrivateBus();
			buss.setBusName(dto.getBusName());
			buss.setBusNo(dto.getBusNo());
			buss.setBusRoot(dto.getBusRoot());
			buss.setBusDetails(dto.getBusDetails());
			bus.add(buss);

		}
		List<PrivateBus> bus2 = repository.saveAll(bus);
		List<PrivateBusDto> dtos = new ArrayList<PrivateBusDto>();
		for (PrivateBus privateBus : bus2) {
			PrivateBusDto privateBusDto = new PrivateBusDto();
			privateBusDto.setBusDetails(privateBus.getBusDetails());
			privateBusDto.setBusName(privateBus.getBusName());
			privateBusDto.setBusNo(privateBus.getBusNo());
			privateBusDto.setBusRoot(privateBus.getBusRoot());
			dtos.add(privateBusDto);
		}
		return dtos;
	}

	@Override
	public PrivateBusDto get(int busNo) {
		Optional<PrivateBus> optional = repository.findById(busNo);
		PrivateBus bus = optional.get();
		PrivateBusDto busDto = new PrivateBusDto();
		busDto.setBusDetails(bus.getBusDetails());
		busDto.setBusName(bus.getBusName());
		busDto.setBusNo(bus.getBusNo());
		busDto.setBusRoot(bus.getBusRoot());
		repository.save(bus);
		return busDto;

	}

	@Override
	public List<PrivateBusDto> getall() {
		List<PrivateBus> bus = repository.findAll();
		List<PrivateBusDto> dtos = new ArrayList<PrivateBusDto>();
		for (PrivateBus privateBus : bus) {
			PrivateBusDto privateBusDto = new PrivateBusDto();
			privateBusDto.setBusDetails(privateBus.getBusDetails());
			privateBusDto.setBusName(privateBus.getBusName());
			privateBusDto.setBusNo(privateBus.getBusNo());
			privateBusDto.setBusRoot(privateBus.getBusRoot());
			dtos.add(privateBusDto);
		}
		return dtos;

	}

	@Override
	public PrivateBusDto update(PrivateBusDto busDto) {
		Optional<PrivateBus> bus = repository.findById(busDto.getBusNo());
		PrivateBus bus2 = bus.get();
		bus2.setBusDetails(busDto.getBusDetails());
		bus2.setBusName(busDto.getBusName());
		bus2.setBusNo(busDto.getBusNo());
		bus2.setBusRoot(busDto.getBusRoot());
		repository.save(bus2);
		return busDto;

	}

	@Override
	public String delete(int busDetailsNo) {
		repository.deleteById(busDetailsNo);
		return "Delete panniyachu pa";
		
	}

}
