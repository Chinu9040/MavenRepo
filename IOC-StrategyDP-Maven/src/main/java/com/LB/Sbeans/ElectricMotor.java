package com.LB.Sbeans;

import org.springframework.stereotype.Component;

@Component("ElectricMotor")
public class ElectricMotor implements IEngine {


	public void engineStart() {
		System.out.println("Electric Motor Started");

	}


	public void engineStop() {
		System.out.println("Electric Motor Stopped");

	}

}
