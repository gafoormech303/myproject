package com.sathya.rms.admin.controller;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.entities.Location;
import com.sathya.rms.admin.service.ICityService;
import com.sathya.rms.admin.service.ILocationService;


@RestController
@RequestMapping(path = "/locations")
public class LocationController {

	
	private static final Logger logger=LogManager.getLogger(LocationController.class);
	
	@Autowired
	private ILocationService service;
	
	@Autowired
	private ICityService cityService;
	
	
	@PostMapping(path = "/insertlocation")
	public Location insertLocation(@RequestBody Location location) {
		
		logger.info("Location insert location method is exceuted started");
		
		    Location result=null;
		
		     Optional<City> ostate=null;
		
		try {
			
			ostate=cityService.findByCid(location.getCid());
			
		    location.setCity(ostate.get());
			
		    if(ostate.get()==null) 
		    	throw new Exception("invalid state id");
			
			result=service.insertLocation(location);
			
			logger.debug("result is:"+result);
		
		}catch(Exception e) {
			
			logger.error("error is happened"+e);
		}
		logger.info("location insert method is executed complted");
		
		return result;
	}
	
	@GetMapping(path = "/getalllocations")
	public Iterable<Location> getAllLocations() {
		 
		logger.info("location getall method is executed started");
		
		Iterable<Location> result=null;
		
		try {
			
			result=service.getAllLocation();
			
			logger.debug("result is :"+result);
		
		}catch(Exception e) {
			
			logger.error("error is happened"+e);
			}
		logger.info("location get all method is executed completed");
       
		return result;
	}
	
	
	@PutMapping(path = "/uodatelocation")
	public Location updateLocation(@RequestBody Location location) {
		
		logger.info("location update method is executed started");
		
		
		Location result=null;
		
		try {
			
			result=service.updataLocation(location);

			logger.debug("result is happend"+result);
			
		}catch(Exception e) {
			
			logger.error("error is happened"+e);
			}
		logger.info("Location update method completed");
		return result;
			}
	
	
	@DeleteMapping(params = "/deletelocation")
	public void deleteLocation(@RequestParam Integer id ) {
	
	logger.info("Location delete method executed started");	
		
	   try
	   {
		   service.deleteLocation(id);
	   
	   logger.debug("result is is sucessfully ");
	   
	   }catch(Exception e) {
		   
		   logger.error("error is happend"+e);
	   }
		logger.info("Location delete method executed completed");
		
	}
	
}
