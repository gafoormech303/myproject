package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entities.Designation;

public interface IDesignationService {

	
	public Designation insertDesig(Designation designation);
	
	public Iterable<Designation> getAllDesigs();
	
	public Designation updateDesigns(Designation designation);
	
	public void deletedesigs(Integer id);
}
