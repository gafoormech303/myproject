package com.sathya.rms.admin.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Dining;
import com.sathya.rms.admin.service.IDiningService;

@RestController
@RequestMapping(path = "/dinines")
public class DiningController {

	@Autowired
	private  IDiningService service;
	
	
	
	
	
	@PostMapping(path = "/insertdiningdata")
	public Dining insertDiningData(@RequestBody Dining dining) {
		
		return service.insertDiningData(dining);
	}
	
	
	
	
	@GetMapping(path = "/getdiningdata")
	public Iterable<Dining> getAllDiningData() {
		
		return service.getAllDiningData();
	}
	
	
	
	
	@GetMapping(path = "/getonediningdata")
	public Optional<Dining>  getOneByDiningData(@RequestParam Integer id) {
		
		return service.getDiningDataById(id);
	}
	
	
	@PutMapping(path = "/updatediningdata")
	
	public Dining UpdateDiningData(@RequestBody Dining  dining) {
		
		return  service.updateDiningData(dining);
	}
	
	@DeleteMapping(path = "/daletediningdata")
	
	public void deleteDiningDataByd(@RequestParam Integer id) {
	
		service.deleteById(id);
		
		
	}
	
}
