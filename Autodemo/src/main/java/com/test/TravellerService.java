package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravellerService {

	Vehicle v;

	
	@Autowired
	public void setV(Vehicle v) {
		this.v = v;
	}
	
	public void startJourney()
	{
		v.move();
	}
}
