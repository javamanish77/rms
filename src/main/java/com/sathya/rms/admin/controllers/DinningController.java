package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Dinning;
import com.sathya.rms.admin.services.DinningService;

@RestController
@RequestMapping(path="/dinning")
public class DinningController {
	
	@Autowired
	DinningService dinningservice;
	
	@PostMapping(path="/addDinning")
	public Dinning insertDinning(Dinning dinning) {
		return dinningservice.insertDinning(dinning);
		
	}

}
