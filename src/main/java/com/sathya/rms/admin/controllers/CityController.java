package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.services.CityService;

@RestController
@RequestMapping(path="/city")
@CrossOrigin
public class CityController {
	
	@Autowired
	CityService cityService;
	
	@GetMapping(path="/getallcities")
	public Iterable<City> getAllCities(){
		return cityService.getAllCities();
	}
	
	@PostMapping(path="/addcity")
	public City insertCity(@RequestBody City city) {
		return cityService.insertCity(city);
	}
	
	@PutMapping(path="/updatecity")
	public City updateCity(@RequestBody City city) {
		return cityService.updateCity(city);
	}

}
