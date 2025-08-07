package com.LB.Sbeans;

import org.springframework.stereotype.Component;

@Component("DieselEngine")
public class DieselEngine implements IEngine {


	public void engineStart() {
		System.out.println("Diesel Engine Started");
		
	}

	
	public void engineStop() {
		System.out.println("Diesel Engine Stopped");
		
	}

}
