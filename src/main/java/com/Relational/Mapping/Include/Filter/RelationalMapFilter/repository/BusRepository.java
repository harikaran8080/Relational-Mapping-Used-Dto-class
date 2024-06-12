package com.Relational.Mapping.Include.Filter.RelationalMapFilter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Relational.Mapping.Include.Filter.RelationalMapFilter.entity.PrivateBus;

@Repository
public interface BusRepository extends JpaRepository<PrivateBus, Integer> {

}
