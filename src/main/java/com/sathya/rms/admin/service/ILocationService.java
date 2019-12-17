package com.sathya.rms.admin.service;



import java.util.Optional;

import com.sathya.rms.admin.entities.Location;

public interface ILocationService {

	
	public  Location  insertLocation(Location location);
	
    public  Iterable<Location> getAllLocation();
    
    public  Location  updataLocation(Location location); 

    public void deleteLocation (Integer id); 

    public Optional<Location> findByLocId(String locId);
}
	
