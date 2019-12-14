package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Shifttype;
import com.sathya.rms.admin.services.ShifttypeService;

@RestController
@RequestMapping(path="/shifttype")
public class ShifttypeController {
	@Autowired
	ShifttypeService shifttypeservice;
	
	@PostMapping(path="/addShift")
	public Shifttype insertShifttype(@RequestBody Shifttype shifttype) {
		return shifttypeservice.insertShifttype(shifttype);
		
	}

}
