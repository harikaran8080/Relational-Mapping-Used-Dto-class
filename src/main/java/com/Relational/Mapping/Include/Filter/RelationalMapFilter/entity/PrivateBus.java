package com.Relational.Mapping.Include.Filter.RelationalMapFilter.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
public class PrivateBus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busNo;
	
	private String busName;
	
	private String busRoot; 
	
	@OneToOne(cascade =CascadeType.ALL )
	@JoinColumn(name = "FK_busDetailsNo")
	private BusDetails busDetails;

}
