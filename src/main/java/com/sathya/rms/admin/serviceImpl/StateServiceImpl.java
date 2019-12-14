package com.sathya.rms.admin.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.StateRepository;
import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.services.StateService;

@Service
public class StateServiceImpl implements StateService{
	
	@Autowired
	StateRepository stateRepository;
	


	public Iterable<State> getAllStates() {
		
		return stateRepository.findAll();
	}

	@Transactional
	public State insertState(State state) {
		return stateRepository.save(state);
	}

	@Transactional
	public State updateState(State state) {
		return stateRepository.save(state);
	}

	@Override
	public void deleteState(Integer id) {
		stateRepository.deleteById(id);
		
	}
}
