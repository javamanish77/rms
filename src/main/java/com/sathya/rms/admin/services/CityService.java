package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.City;

public interface CityService {

	public City insertCity(City city);
	
	public City updateCity(City city); 
	
	public Iterable<City> getAllCities();
	
	public void deleteCity(Integer id);

} 
