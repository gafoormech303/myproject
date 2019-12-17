package com.sathya.rms.admin.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sathya.rms.admin.data.StateRepository;
import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.service.IStateService;




@Service

public class StateServiceImpl  implements IStateService{

	@Autowired
	private StateRepository repo;

	@Override
	public Iterable<State> getAllStates() {
		return repo.findAll();
	}

	@Transactional
	public State insertStates(State state) {
		return repo.save(state);
	}


	@Transactional
	public State updateState(State state) {
		return repo.save(state);
	}

	@Transactional
	public void deleteById(Integer id) {

		repo.deleteById(id);
	}


	public void allDelete() {

		repo.deleteAll();
	}

	@Transactional
	public void deleteAll() {

		repo.deleteAll();		
	}

	@Override
	public Optional<State> findByStId(String stId) {
		
		return repo.findByStId(stId);
	}

}
