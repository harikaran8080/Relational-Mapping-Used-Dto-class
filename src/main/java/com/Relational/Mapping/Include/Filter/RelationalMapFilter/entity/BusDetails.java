package com.Relational.Mapping.Include.Filter.RelationalMapFilter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="bus details")
public class BusDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busDetailsNo;
	
	private String nameOfBus;
	
	private String busDriverName;

	private String busConductor;

}
