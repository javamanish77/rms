package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.State;

public interface StateService {
	
	public Iterable<State> getAllStates();
	
	public State insertState(State state);
	
	public State updateState(State state);
	
	public void deleteState(Integer id);

}
