package com.sathya.rms.admin.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.RestaurantRepository;
import com.sathya.rms.admin.entities.Restaurant;
import com.sathya.rms.admin.service.IRestaurantService;

@Service
public class RestaurantServiceImpl implements IRestaurantService {

	
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	
	
	@Transactional
	public Restaurant insertRestaurantData(Restaurant restaurant) {
		
		return restaurantRepository.save(restaurant);
	}

	@Override
	public Iterable<Restaurant> getAllRestaurantData() {
		return restaurantRepository.findAll();
	}

	@Transactional
	public Restaurant updateRestarantData(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@Override
	public void deleteById(Integer id) {
		restaurantRepository.deleteById(id);
	}

	@Override
	public Optional<Restaurant> findByRid(String rid) {

		return restaurantRepository.findByRid(rid);
	}

	

}
