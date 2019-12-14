package com.sathya.rms.admin.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.DinningRepository;
import com.sathya.rms.admin.entities.Dinning;
import com.sathya.rms.admin.services.DinningService;
@Service
public class DinningServiceImpl implements DinningService {
	@Autowired
	DinningRepository dinningRepository;

	@Transactional
	@Override
	public Dinning insertDinning(Dinning dinning) {
		return dinningRepository.save(dinning);
	}

	@Override
	@Transactional
	public Dinning updateDinning(Dinning dinning) {
		return dinningRepository.save(dinning);
	}

	@Override
	public void deleteDinning(Integer id) {
		dinningRepository.deleteById(id);
	}

	@Override
	public Iterable<Dinning> getAllDinning() {
		return dinningRepository.findAll();
	}

}
