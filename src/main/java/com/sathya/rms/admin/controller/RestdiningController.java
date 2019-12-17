package com.sathya.rms.admin.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Dining;
import com.sathya.rms.admin.entities.Restaurant;
import com.sathya.rms.admin.entities.Restdining;
import com.sathya.rms.admin.service.IDiningService;
import com.sathya.rms.admin.service.IRestaurantService;
import com.sathya.rms.admin.service.IRestdiningService;

@RestController
@RequestMapping(path = "/restdinings")
public class RestdiningController {

	@Autowired
	private IRestdiningService service;
	
	@Autowired
	private IRestaurantService restaurantService;
	
	@Autowired
	private IDiningService diningService;
	
	
	
	
	@PostMapping(path = "/insertRestdining")
	public Restdining insertRestdiningData(@RequestBody Restdining restdining) throws Exception {
		
	
		Optional<Restaurant> ostate=restaurantService.findByRid(restdining.getRid());
		
	         restdining.setRestaurant(ostate.get());	
   		
		Optional<Dining> istate=diningService.findByDid(restdining.getDid());
		
		         restdining.setDining(istate.get());
		
		if(ostate==null||istate==null) 
			throw new Exception("invalid id");
		         
		         
		return service.insertRestdining(restdining);
	}
	
	
	@GetMapping(path = "/getrestdiningdata")
	public Iterable<Restdining> getRestdiningData() {
		
		return service.getAllRestdiningData();
	}
	
	
	@PutMapping(path = "/updaterestdining")
	public Restdining updateRestdiningData(@RequestBody Restdining restdining) {
		
		return service.updateRestdiningData(restdining); 
	}
	
	@DeleteMapping(path = "/deleteById")
	public void deleteById(Integer id) {
		
		service.deleteById(id);
		
	}
	
}
