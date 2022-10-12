package com.profesorp.service;

import org.springframework.stereotype.Service;

import com.profesorp.MotoService.AdapterService;

@Service("Truck")
public class TruckService implements AdapterService{
	int numberExecution=1;
	@Override
	public String process() {
		return "inside truck service -  number of executions: "+(numberExecution++);
	}
}
