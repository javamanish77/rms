package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Dinning;

public interface DinningService {
	
	public Dinning insertDinning(Dinning dinning);
	
	public Dinning updateDinning(Dinning dinning);
	
	public void deleteDinning(Integer id);
	
	public Iterable<Dinning> getAllDinning();
}
