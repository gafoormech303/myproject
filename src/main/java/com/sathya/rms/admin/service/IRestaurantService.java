package com.sathya.rms.admin.service;

import java.util.Optional;

import com.sathya.rms.admin.entities.Restaurant;

public interface IRestaurantService {

	
	public Restaurant insertRestaurantData(Restaurant restaurant);
	
	public Iterable<Restaurant> getAllRestaurantData();
	
	public Restaurant updateRestarantData(Restaurant restaurant);
	
	public void deleteById(Integer id);
	
	public Optional<Restaurant> findByRid(String rid);
}
