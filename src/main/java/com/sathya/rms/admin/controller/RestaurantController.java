package com.sathya.rms.admin.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Location;
import com.sathya.rms.admin.entities.Restaurant;
import com.sathya.rms.admin.service.ILocationService;
import com.sathya.rms.admin.service.IRestaurantService;

@RestController
@RequestMapping(path = "/restaurants")
public class RestaurantController {

	@Autowired
	private IRestaurantService restaurantService;
	
	@Autowired
	private ILocationService locationService;
	
	
	@PostMapping(path = "/insertRestaurantData")
	public Restaurant insertRestaurantData(@RequestBody Restaurant restaurant) {
		
		             
		Optional<Location> ostate=locationService.findByLocId(restaurant.getLocId());
		
		 restaurant.setLocation(ostate.get());
		
		
		return restaurantService.insertRestaurantData(restaurant);
	}
	
	@GetMapping(path = "/updateRestaurantData")
	public Iterable<Restaurant> getAllRestaurantdata() {
		
		return restaurantService.getAllRestaurantData();
		
	}
	
	@PutMapping(path = "/updateRestarantdata")
	public Restaurant updateRestaurantData(@RequestBody Restaurant restaurant) {
	
		return restaurantService.updateRestarantData(restaurant);
	
	
}
	
	@DeleteMapping(path = "/deleteById")
	public void deletebyId(@RequestParam Integer id) {
		
		restaurantService.deleteById(id);
	}
	
}
