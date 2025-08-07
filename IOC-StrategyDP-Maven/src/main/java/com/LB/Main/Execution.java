package com.LB.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.LB.Cfgs.AppConfig;
import com.LB.Sbeans.Vehicle;

public class Execution {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle vehicle=container.getBean("Vehicle",Vehicle.class);
		vehicle.journey("Chinu");
		container.close();
	}

}
