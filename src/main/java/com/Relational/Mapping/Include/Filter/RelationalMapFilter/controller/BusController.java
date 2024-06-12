package com.Relational.Mapping.Include.Filter.RelationalMapFilter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Relational.Mapping.Include.Filter.RelationalMapFilter.dto.PrivateBusDto;
import com.Relational.Mapping.Include.Filter.RelationalMapFilter.service.ServiceImplement;

@RestController
@RequestMapping("/Bus/Api")
public class BusController {
	
	@Autowired
	private ServiceImplement implement;
	
	@PostMapping("/post")
	public PrivateBusDto post(@RequestBody PrivateBusDto busDto) {
		return implement.post(busDto);
	}
	
	@PostMapping("/postall")
	public List<PrivateBusDto>postall(@RequestBody List<PrivateBusDto> busDto){
		return implement.postall(busDto);
	}
	
	@GetMapping("/get/{busNo}")
	public PrivateBusDto get(@PathVariable int busNo) {
		return implement.get(busNo);
	}
	
	@GetMapping("/getall")
	public List<PrivateBusDto>getall(){
		return implement.getall();
	}
	
	@PutMapping("/update")
	public PrivateBusDto update(@RequestBody PrivateBusDto busDto) {
		return implement.update(busDto);
	}
	
	@DeleteMapping("/delete/{busDetailsNo}")
	public String delete(@PathVariable int busDetailsNo) {
		return implement.delete(busDetailsNo);
	}
	
	
	
	
	
	
	

}
