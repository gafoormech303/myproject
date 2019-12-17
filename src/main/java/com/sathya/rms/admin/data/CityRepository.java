package com.sathya.rms.admin.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entities.City;

public interface CityRepository extends CrudRepository< City, Integer> {

	
	public Optional<City> findByCid(String cid);
}
