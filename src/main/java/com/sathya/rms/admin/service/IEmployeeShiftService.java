package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entities.EmployeeShift;

public interface IEmployeeShiftService {

	
	public EmployeeShift insertEmpoyeeShiftData(EmployeeShift employeeShift);
	
	public Iterable<EmployeeShift> getAllEmployeeShiftData();
	
	public EmployeeShift updateEmployeeShiftData(EmployeeShift employeeShift);
	
	public void deleteEmployeeShiftDataById(Integer id);
	
}
