package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entities.Restdining2;

public interface IRestdining2Service  {


	public Restdining2 insertRestdining(Restdining2 restdining2);
	
	public Iterable<Restdining2> getAllRestdiningData();
	
	public Restdining2 updateRestdiningData(Restdining2 restdining2);
	
	public void deleteById(Integer id);

	
	
}
