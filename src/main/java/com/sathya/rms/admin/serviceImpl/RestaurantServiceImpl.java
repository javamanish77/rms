package com.sathya.rms.admin.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.RestaurantRepository;
import com.sathya.rms.admin.entities.Restaurant;
import com.sathya.rms.admin.services.RestaurantService;
@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	RestaurantRepository restaurantrepository;

	@Transactional
	@Override
	public Restaurant insertRestaurant(Restaurant restaurant) {
		return restaurantrepository.save(restaurant);
		
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRestaurant(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Restaurant> getAllRestaurant() {
		// TODO Auto-generated method stub
		return null;
	}

}
