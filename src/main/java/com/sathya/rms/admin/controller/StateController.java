package com.sathya.rms.admin.controller;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.service.IStateService;

@RestController
@RequestMapping(path = "/states")
public class StateController {

private static final Logger logger=LogManager.getLogger(StateController.class);
	
	
	
	@Autowired
	private IStateService service;
	
	
	@GetMapping(path = "/getallstates")
	public  Iterable<State> getAllStates() {
		
		logger.info("get all States method excetuion");
		
		Iterable<State> result=null;
		
	  try {
			
	     result=service.getAllStates();
		
		logger.debug("result is {0}",result);
			
	    }catch(Exception e) {
			
		logger.	error("exception happens and exception info is{0}",e);
	    }
		
		logger.info("get all states method exceution completed");
		
		return  result;
		
	}
	
	
	@PostMapping("/addstate")
	public State insertStates(@RequestBody State state) {
		
		logger.info("Insert state method execution started");
		
		State result=null;
		
		
		try {
	
			result=service.insertStates(state);
			
			logger.debug("resilt is:"+result);
			
		}catch(Exception e) {
			
			logger.error("exception happen "+e);
		}
		
		logger.info("insert state methosd is executed completed");
		
        return result;
				
	}
	
	
	
	
	
	
	
	@PutMapping(path = "/updatestate")
	public State updateState( @RequestBody State state) {
		
		logger.info("State upadate method is exceuted started");
		    
		State result=null;
		
		try
		{
			
			 result=service.updateState(state);
			 
			 logger.debug("result is:"+result);
		
		}catch(Exception e) {
			
			logger.error("exception happend"+e);
			
		}
	
	logger.info("state update method is executed completed");
	
	return result;
	}
	
	
	
	
	
	/* @DeleteMapping(path = "/deletestate")
	public void deleteById(@RequestParam Integer id) {
		
		service.deleteById(id);}*/
	
	
	
	@DeleteMapping(path = "/deletestate/{id}")
	public void deleteById(@PathVariable Integer id ) {
		
		service.deleteById(id);
	}
	
	
	
	
	
	
	@DeleteMapping(path = "/deletestates")
	public void deleteAll() {
		
		logger.info("state delete method is executed started");
		
		try {
		
			service.deleteAll();	
		
			logger.debug("suceffully exceuted");
			
		}catch(Exception e) {
			
			logger.error("error is heppend:"+e);
					}
		
		logger.info("state delete exceution methosd is completed");

		
	}
	
}
