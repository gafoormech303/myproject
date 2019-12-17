package com.sathya.rms.admin.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.service.ICityService;
import com.sathya.rms.admin.service.IStateService;

@RestController
@RequestMapping(path = "/cities")
public class CityController {

	private static final Logger logger=LogManager.getLogger(CityController.class);


	@Autowired
	public ICityService cityservice;

	@Autowired
	private IStateService stateService;

	@PostMapping(path = "/addcity")
	public City insertCity(@RequestBody City city) throws Exception{

		logger.info("city insert  exceution  method statrted");  

		Optional<State> ostate=null;

		City result=null;

		try
		{
			ostate=stateService.findByStId(city.getStId());	

			city.setState(ostate.get());

			if(ostate.get()==null)	

				throw new Exception("invalid state id");

			result=cityservice.inserCity(city);

			logger.debug("result is:"+result);
			
		}catch(Exception e) {

			logger.error("error is happend"+e);

		}

		logger.info("city insert method is executed  completed");

		return result;

	}

	@GetMapping(path = "/getallcities")
	public Iterable<City> getAllc(){
		
		
		logger.info("city get method execution started");
		
		Iterable<City> result=null;
		
		try
		{
			
			result=cityservice.getAllCities();
			
			logger.debug("result is {0}"+result);
			
		}catch(Exception e) {
			
		logger.error("error is:"+e);	
			
			
		}
		logger.info("city get method is executed completed");
	
		return result;

}



	@PutMapping(path = "/updatecity")
	public City updataCity(@RequestBody City city) {
		
		logger.info("city get method executed is started ");
		
		City result=null;
		
		try {
			
			result=cityservice.updateCity(city);
			
			logger.debug("result is {0}"+result);
			
		}catch(Exception e) {
			
			logger.error("error is happened :"+e);
			
		}
		logger.info("city update metgod is executed completed");
		return result;
				}





	@DeleteMapping(path = "/deletecity")
	public void deletebyId(@PathParam(value = "2") Integer id)
	{
		logger.info("city delete one method execution satrted");
		
		
		try {

			cityservice.deleteCity(id);

			logger.debug("result is sucessfully executed");
			
        }catch(Exception e) {
			
			logger.error("error happend"+e);
			
		}
		logger.info("city delete one method execution completed");
		
	}

	@DeleteMapping(path = "/deleteall")
	public void deleteAll() {

		logger.info("city delete  all method is executed started ");
		
		try {
		
			cityservice.deleteAll();
		
		}catch(Exception e) {
			
			logger.error("error is happend"+e);
			
	}
		
   logger.info("city delete all method is excetued completed");
		
		
	}
}

