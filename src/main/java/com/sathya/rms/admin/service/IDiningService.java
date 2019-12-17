package com.sathya.rms.admin.service;

import java.util.Optional;

import com.sathya.rms.admin.entities.Dining;

public interface IDiningService {

	public  Dining insertDiningData(Dining dining);
	
	public Iterable<Dining> getAllDiningData();
	
	public Optional<Dining> getDiningDataById(Integer id);
	
	public  Dining updateDiningData(Dining dining);
	
	public void deleteById(Integer id);
	
	public Optional<Dining> findByDid(String did);
}
