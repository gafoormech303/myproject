package com.sathya.rms.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.Restdining2Repository;
import com.sathya.rms.admin.entities.Restdining2;
import com.sathya.rms.admin.service.IRestdining2Service;

@Service
public class Restdining2ServiceImpl  implements IRestdining2Service{

	
	@Autowired
	private Restdining2Repository restdining2Repository; 	
	
	
	
	@Transactional
	public Restdining2 insertRestdining(Restdining2 restdining2) {
		
		return restdining2Repository.save(restdining2);
	}

	@Override
	public Iterable<Restdining2> getAllRestdiningData() {
		
		return restdining2Repository.findAll();
	}

	@Transactional
	public Restdining2 updateRestdiningData(Restdining2 restdining2) {
	
		return restdining2Repository.save(restdining2);
	}

	@Transactional
	public void deleteById(Integer id) {
		
		restdining2Repository.deleteById(id);
		
		
	}

}
