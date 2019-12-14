package com.sathya.rms.admin.services;

import java.util.List;

import com.sathya.rms.admin.entities.Shifttype;

public interface ShifttypeService {
	
	public Shifttype insertShifttype(Shifttype shifttype);
	
	public Shifttype updateShifttype(Shifttype shifttype);
	
	public void deleteShifttype(Integer id);
	
	public List<Shifttype> getAllShifttype();
	
	

}
