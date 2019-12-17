package com.sathya.rms.admin.service;

import java.util.Optional;

import com.sathya.rms.admin.entities.State;

public interface IStateService {

	public Iterable<State> getAllStates(); 
	
	public State insertStates(State state);
	
	public State updateState(State state);
	
	public void deleteById(Integer id);
	
	public void deleteAll();
	
	public Optional<State> findByStId(String stId);
	
}
