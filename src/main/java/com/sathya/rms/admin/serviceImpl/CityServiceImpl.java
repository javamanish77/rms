package com.sathya.rms.admin.serviceImpl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.CityRepository;
import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.services.CityService;
@Service
public class CityServiceImpl implements CityService {
	@Autowired
	CityRepository cityRepository;

	@Transactional
	public City insertCity(City city) {
		return cityRepository.save(city);
	}

	@Transactional
	public City updateCity(City city) {
		return cityRepository.save(city);
	}

	@Override
	public Iterable<City> getAllCities() {
		return cityRepository.findAll();
	}

	@Override
	public void deleteCity(Integer id) {
		cityRepository.deleteById(id);
	}

}
