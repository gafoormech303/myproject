package com.sathya.rms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Restdining2;
import com.sathya.rms.admin.service.IRestdining2Service;

@RestController
@RequestMapping(path = "restdining2")
public class Restdining2Controller {

	
	

	@Autowired
	private IRestdining2Service service;
	
	@PostMapping(path = "/insertRestdining")
	public Restdining2 insertRestdiningData(@RequestBody Restdining2 restdining2) {
		
		return service.insertRestdining(restdining2);
	}
	
	
	@GetMapping(path = "/getrestdiningdata")
	public Iterable<Restdining2> getRestdiningData() {
		
		return service.getAllRestdiningData();
	}
	
	
	@PutMapping(path = "/updaterestdining")
	public Restdining2 updateRestdiningData(@RequestBody Restdining2 restdining2) {
		
		return service.updateRestdiningData(restdining2); 
	}
	
	@DeleteMapping(path = "/deleteById")
	public void deleteById(Integer id) {
		
		service.deleteById(id);
		
	}
}
