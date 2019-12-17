package com.sathya.rms.admin.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entities.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

	public Optional<Restaurant> findByRid(String rid);
	
}
