package com.sathya.rms.admin.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

	public Optional<Location> findByLocId(String locId);
	
	
	
	
}
