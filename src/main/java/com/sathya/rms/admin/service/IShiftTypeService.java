package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entities.ShiftType;

public interface IShiftTypeService {

	public ShiftType insertShifts(ShiftType shiftType);
	
	public Iterable<ShiftType> getAllShifts();
	
	public ShiftType updateShifts(ShiftType shiftType);
	
	public void deleteShifts(Integer id );
	
	
}
