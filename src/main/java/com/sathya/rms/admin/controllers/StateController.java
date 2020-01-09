package com.sathya.rms.admin.controllers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.services.StateService;

@RestController
@RequestMapping(path="/state")
@CrossOrigin
public class StateController {
	
	@SuppressWarnings("unused")
	private static final Logger logger=LogManager.getLogger(StateController.class);
	
	@Autowired()
	StateService stateService;

	@GetMapping(path = "/getallstates")
	public Iterable<State> getAllStates() {
		
		return stateService.getAllStates();
	}
	
	@PostMapping("/addState")
	public State insertState(@RequestBody State state) {

		return stateService.insertState(state);
	}
	
	@PutMapping(path="/updateState")
	public State updateState(@RequestBody State state) {
		return stateService.updateState(state);
	}
	
	@DeleteMapping(path="id")
	public State deleteState(Integer id) {
		return null;
		
	}
}
