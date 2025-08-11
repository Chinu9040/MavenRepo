package com.practice.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	private IEngine engine;
	
	public void journey(String name)
	{
		System.out.println("Hi "+name);
		engine.engineStart();
		engine.engineStop();
	}

}
