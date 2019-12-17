package com.sathya.rms.admin.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.LocationRepository;
import com.sathya.rms.admin.entities.Location;
import com.sathya.rms.admin.service.ILocationService;

@Service
public class LocationServiceImpl implements ILocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	@Transactional
	public Location insertLocation(Location location) {
		
		return locationRepository.save(location);
	}

	@Override
	public Iterable<Location> getAllLocation() {
	
		return locationRepository.findAll();
	}

	@Transactional
	public Location updataLocation(Location location) {
		
		return locationRepository.save(location);
	}

	@Transactional
	public void deleteLocation(Integer id) {
     
		locationRepository.deleteById(id);

}

	@Override
	public Optional<Location> findByLocId(String locId) {

		return locationRepository.findByLocId(locId);
	}
}