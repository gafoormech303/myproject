package com.sathya.rms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.EmployeeShift;
import com.sathya.rms.admin.service.IEmployeeShiftService;

@RestController
@RequestMapping(path = "/employeeshift")
public class EmployeeShiftController {


	@Autowired
	private IEmployeeShiftService service;



	@PostMapping(path = "/insertEmployeeShiftData")
	public EmployeeShift insertEmployeeShiftData(@RequestBody EmployeeShift employeeShift) {

		return service.insertEmpoyeeShiftData(employeeShift);

	}

	@GetMapping(path = "/getAllEmployeeShiftData")
	public  Iterable<EmployeeShift> getAllEmployeeShiftData(){

		return service.getAllEmployeeShiftData();
	}



	@PutMapping(path = "/updateEmployeeShiftData")
	public EmployeeShift updateEmployeeShiftData(@RequestBody EmployeeShift employeeShift) {

		return service.updateEmployeeShiftData(employeeShift);
	}


	@DeleteMapping(path = "/deleteById")
	public void deleteById(@RequestParam Integer id) {

		service.deleteEmployeeShiftDataById(id);

	}

}
