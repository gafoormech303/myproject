package com.sathya.rms.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.ShiftTypeRepository;
import com.sathya.rms.admin.service.IShiftTypeService;
import com.sathya.rms.admin.entities.ShiftType;

@Service
public class ShiftTypeServiceImpl implements IShiftTypeService  {

	@Autowired
    private ShiftTypeRepository  shiftTypeRepository;	

	@Transactional
	public ShiftType insertShifts(ShiftType shiftType) {
		
		return shiftTypeRepository.save(shiftType);
	}

	@Override
	public Iterable<ShiftType> getAllShifts() {
		
		return shiftTypeRepository.findAll();
	}

	@Override
	public ShiftType updateShifts(ShiftType shiftType) {
		
		return shiftTypeRepository.save(shiftType);
	}

	@Override
	public void deleteShifts(Integer id) {
		
		shiftTypeRepository.deleteById(id);		
	}

}
