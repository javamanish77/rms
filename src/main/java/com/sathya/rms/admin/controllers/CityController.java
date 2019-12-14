package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.services.CityService;

@RestController
@RequestMapping(path="/city")
public class CityController {
	
	@Autowired
	CityService cityService;
	
	@PostMapping(path="/addcity")
	public City insertCity(@RequestBody City city) {
		return cityService.insertCity(city);
	}
	
	@PutMapping(path="/updatecity")
	public City updateCity(@RequestBody City city) {
		return cityService.updateCity(city);
	}

}
