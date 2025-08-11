package com.practice.sbeans;

import org.springframework.stereotype.Component;

//@Component("ElectricEngine")
public class ElectricEngine implements IEngine{

	@Override
	public void engineStart() {
		System.out.println("Electric Engine Started");
		
	}

	@Override
	public void engineStop() {
		System.out.println("Electric Engine Stopped");
		
	}
}
