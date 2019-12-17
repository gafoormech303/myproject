package com.sathya.rms.admin.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entities.Dining;

public interface DiningRepository extends CrudRepository<Dining, Integer> {

	
	
	public Optional<Dining> findByDid(String  did);
}
