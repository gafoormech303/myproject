package com.sathya.rms.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.EmployeeShiftRepository;
import com.sathya.rms.admin.entities.EmployeeShift;
import com.sathya.rms.admin.service.IEmployeeShiftService;

@Service
public class EmployeeShiftServiceImpl implements IEmployeeShiftService {

	@Autowired
	private EmployeeShiftRepository repository;

	@Transactional
	public EmployeeShift insertEmpoyeeShiftData(EmployeeShift employeeShift) {
		
		return repository.save(employeeShift);
	}

	
	
	
	@Override
	public Iterable<EmployeeShift> getAllEmployeeShiftData() {
	
		return repository.findAll();
	}

	
	
	@Transactional 
	public EmployeeShift updateEmployeeShiftData(EmployeeShift employeeShift) {
		
		return repository.save(employeeShift);
	}

	@Transactional
	public void deleteEmployeeShiftDataById(Integer id) {
		
		repository.deleteById(id);		
	}
	
	
	
}
