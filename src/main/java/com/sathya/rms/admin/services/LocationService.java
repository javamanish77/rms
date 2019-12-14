package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Location;

public interface LocationService {

	public Location insertLocation(Location location);
	
	public Location updateLocation(Location location);
	
	public void deleteLocation(Integer id);
	
	public Iterable<Location> getAllLocation();
	
}
