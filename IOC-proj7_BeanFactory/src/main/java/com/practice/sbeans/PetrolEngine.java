package com.practice.sbeans;

import org.springframework.stereotype.Component;

//@Component("PetrolEngine")
public class PetrolEngine implements IEngine{

	@Override
	public void engineStart() {
		System.out.println("Petrol Engine Started");
		
	}

	@Override
	public void engineStop() {
		System.out.println("Petrol Engine Stopped");
		
	}
}