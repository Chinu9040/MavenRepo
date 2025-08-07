package com.LB.Sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("Vehicle")
@Service("Vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("Engine")
	private IEngine iEngine;
	
	public void journey(String driver)
	{
		System.out.println(driver +" The journey has started");
		iEngine.engineStart();
		System.out.println("Enjoy The Ride");
		System.out.println("..............");
		System.out.println("You ave Reached The Destination");
		iEngine.engineStop();
	}
	
}
