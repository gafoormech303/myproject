package com.sathya.rms.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.RestdiningRepository;
import com.sathya.rms.admin.entities.Restdining;
import com.sathya.rms.admin.service.IRestdiningService;

@Service
public class RestdiningServiceImpl implements IRestdiningService  {

	@Autowired
	private RestdiningRepository restdiningRepository;

	@Transactional
	public Restdining insertRestdining(Restdining restdining) {
		return restdiningRepository.save(restdining);
	}

	@Override
	public Iterable<Restdining> getAllRestdiningData() {
		return restdiningRepository.findAll();
	}

	@Transactional
	public Restdining updateRestdiningData(Restdining restdining) {
		return restdiningRepository.save(restdining);
	}

	@Transactional
	public void deleteById(Integer id) {
		restdiningRepository.deleteById(id);		
	}
	
	
	
}
