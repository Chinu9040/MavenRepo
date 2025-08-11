package com.practice.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.configs.AppConfig;
import com.practice.sbeans.Vehicle;

public class Execution {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
	      Vehicle vehicle=container.getBean("vehicle",Vehicle.class);
	      vehicle.journey("Chinu");
	      container.close();

	}

}
