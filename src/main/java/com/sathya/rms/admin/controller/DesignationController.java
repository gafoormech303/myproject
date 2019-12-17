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

import com.sathya.rms.admin.entities.Designation;
import com.sathya.rms.admin.service.IDesignationService;

@RestController
@RequestMapping(path = "/designations")
public class DesignationController {

	@Autowired
	private IDesignationService service;
	
	@PostMapping(path = "/insertdesigns")
	public Designation insertdesigns(@RequestBody Designation designation ) {
		
		return service.insertDesig(designation);
	}
	
	
	@GetMapping(path = "/getalldesigs")
	public Iterable<Designation > getAllDesigns ( ) {
		
		
		return service.getAllDesigs();
	}
	
	
	@PutMapping(path = "/updatedesigns")
	public Designation updateDesigns(@RequestBody Designation  designation ) {
	
	return service.updateDesigns(designation);
	
	}
	
	@DeleteMapping(path = "/deletedesigns")
	public void deleteDesins(@RequestParam Integer id) {
		
		service.deletedesigs(id);
		
	}
	
	
	
}
