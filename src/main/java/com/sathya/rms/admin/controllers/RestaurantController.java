package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Restaurant;
import com.sathya.rms.admin.services.RestaurantService;

@RestController
@RequestMapping(path="/restaurant")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@PostMapping(path="/addrestaurant")
	public Restaurant insertRestaurant(Restaurant restaurant) {
		return restaurantService.insertRestaurant(restaurant);
		
		
	}

}
