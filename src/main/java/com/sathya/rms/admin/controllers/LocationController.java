package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Location;
import com.sathya.rms.admin.services.LocationService;

@RestController
@RequestMapping(path="/location")
public class LocationController {
	
	@Autowired
	LocationService locationService;
	
	@PostMapping(path="/addlocation")
	public Location insertLocation(@RequestBody Location location) {
		return locationService.insertLocation(location);
	}

	@PutMapping(path="updatelocation")
	public Location updateLocation(@RequestBody Location location) {
		return locationService.updateLocation(location);
		
	}
}
