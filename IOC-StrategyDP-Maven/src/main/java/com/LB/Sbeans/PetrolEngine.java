package com.LB.Sbeans;

import org.springframework.stereotype.Component;

@Component("PetrolEngine")
public class PetrolEngine implements IEngine {

	public void engineStart() {
		System.out.println("Petrol Engine Started");

	}

	public void engineStop() {
		System.out.println("Petrol Engine Stopped");

	}

}
