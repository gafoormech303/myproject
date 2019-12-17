package com.sathya.rms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.service.IShiftTypeService;
import com.sathya.rms.admin.entities.ShiftType;

@RestController
@RequestMapping("shifts")
public class ShiftTypeController {
      
	@Autowired
	private IShiftTypeService service;
	
	
	@PostMapping(path = "/insertshifts")
	public ShiftType insertShifts(@RequestBody  ShiftType shiftType) {
		
		return service.insertShifts(shiftType);		
	}
	
	
	
	@GetMapping(path = "/getallShifts")
	public Iterable<ShiftType> getAllShifts() {
		
		return service.getAllShifts();
	}

	
	
       @PutMapping(path = "/updateshift")
     public ShiftType updateShifts(ShiftType shiftType) {
    	 
    	 return service.updateShifts(shiftType);
     }
 
@DeleteMapping(path = "/deleteshift")
public void deleteShifts(Integer id) {
	
	service.deleteShifts(id);
}
}
