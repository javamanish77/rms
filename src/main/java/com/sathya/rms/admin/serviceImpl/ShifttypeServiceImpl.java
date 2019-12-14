package com.sathya.rms.admin.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.ShifttypeRepository;
import com.sathya.rms.admin.entities.Shifttype;
import com.sathya.rms.admin.services.ShifttypeService;
@Service
public class ShifttypeServiceImpl implements ShifttypeService {

	@Autowired
	ShifttypeRepository shifttyperepository;
	
	@Override
	@Transactional
	public Shifttype insertShifttype(Shifttype shifttype) {
		return shifttyperepository.save(shifttype);
	}

	@Transactional
	@Override
	public Shifttype updateShifttype(Shifttype shifttype) {
		return shifttyperepository.save(shifttype);
	}

	@Override
	public void deleteShifttype(Integer id) {
      shifttyperepository.deleteById(id);
      
	}

	@Override
	public List<Shifttype> getAllShifttype() {
		// TODO Auto-generated method stub
		return null;
	}

}
