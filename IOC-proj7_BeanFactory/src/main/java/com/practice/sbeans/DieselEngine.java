package com.practice.sbeans;

import org.springframework.stereotype.Component;

//@Component("DieselEngine")
public class DieselEngine implements IEngine{

	@Override
	public void engineStart() {
		System.out.println("Dieseel Engine Started");
		
	}

	@Override
	public void engineStop() {
		System.out.println("Dieseel Engine Stopped");
		
	}

}
