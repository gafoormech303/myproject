package com.sathya.rms.admin.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.CityRepository;
import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.service.ICityService;

@Service
public class CityServiceImpl implements ICityService {

	
	   @Autowired
	  private CityRepository  cityRepository;
	
	  
	  
	 @Transactional
	public City inserCity(City city) {
		
		 return cityRepository.save(city);
	}
        public Iterable<City> getAllCities() {
			
        	return cityRepository.findAll();
		}

	

	@Transactional
	public City updateCity(City city) {
		
		return cityRepository.save(city);
	}

	@Transactional
	public void deleteCity(Integer id) {
	  
		cityRepository.deleteById(id);	
	}

	@Transactional
	public void deleteAll() {
		
		cityRepository.deleteAll();
	}
	
	
	@Override
	public Optional<City> findByCid(String cid) {
		
		return cityRepository.findByCid(cid);
	}




	
	
	
}
