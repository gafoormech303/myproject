package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entities.Restdining;

public interface IRestdiningService {
	
	public Restdining insertRestdining(Restdining restdining);
	
	public Iterable<Restdining> getAllRestdiningData();
	
	public Restdining updateRestdiningData(Restdining restdining);
	
	public void deleteById(Integer id);

}
