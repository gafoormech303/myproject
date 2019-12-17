package com.sathya.rms.admin.service;

import java.util.Optional;

import com.sathya.rms.admin.entities.City;

public interface ICityService {

	
	public City inserCity(City city);
	
	public Iterable<City> getAllCities();
	
	public  City updateCity(City city);
	
	public void deleteCity(Integer id);
	
	public void deleteAll();
	
	
	public Optional<City> findByCid(String cid);
}
