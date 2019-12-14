package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Restaurant;

public interface RestaurantService {

	public Restaurant insertRestaurant(Restaurant restaurant);
	
	public Restaurant updateRestaurant(Restaurant restaurant);
	
	public void deleteRestaurant(Integer id);
	
	public Iterable<Restaurant> getAllRestaurant();
}