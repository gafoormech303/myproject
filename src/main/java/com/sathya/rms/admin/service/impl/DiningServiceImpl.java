package com.sathya.rms.admin.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.DiningRepository;
import com.sathya.rms.admin.entities.Dining;
import com.sathya.rms.admin.service.IDiningService;

@Service
public class DiningServiceImpl implements IDiningService {

	@Autowired
	private DiningRepository diningRepository;
	
	@Transactional
	public Dining insertDiningData(Dining dining) {
		
		return diningRepository.save(dining);
	}

	@Override
	public Iterable<Dining> getAllDiningData() {
		
		return diningRepository.findAll();
	}

	@Override
	public Optional<Dining> getDiningDataById(Integer id) {
		
		return diningRepository.findById(id);
	}

      @Transactional
	public Dining updateDiningData(Dining dining) {
		
    	  return diningRepository.save(dining);
	}

	@Transactional
	public void deleteById(Integer id) {
		
		diningRepository.deleteById(id);		
	}

	@Override
	public Optional<Dining> findByDid(String did) {
		
		return diningRepository.findByDid(did);
	}

}
