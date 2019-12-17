package com.sathya.rms.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.DesignationRepository;
import com.sathya.rms.admin.entities.Designation;
import com.sathya.rms.admin.service.IDesignationService;

@Service
public class DesignationServiceImpl implements IDesignationService {

	@Autowired
	private DesignationRepository designationRepository;

	@Transactional
	public Designation insertDesig(Designation designation) {
		
		return designationRepository.save(designation);
	}

	@Override
	public Iterable<Designation> getAllDesigs() {

		return designationRepository.findAll();
	}

	@Transactional
	public Designation updateDesigns(Designation designation) {
		
		return designationRepository.save(designation);
	}

	@Transactional
	public void deletedesigs(Integer id) {
		
		designationRepository.deleteById(id);
	}

	
}
