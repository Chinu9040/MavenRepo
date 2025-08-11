package com.practice.factorybeans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.practice.sbeans.DieselEngine;
import com.practice.sbeans.ElectricEngine;
import com.practice.sbeans.IEngine;
import com.practice.sbeans.PetrolEngine;

@Component("EngineFactory")
public class EngineFactoryBean implements FactoryBean<IEngine>{
	
	@Value("${Engine.type}")
	private String engineType;

	@Override
	public IEngine getObject() throws Exception {
		switch (engineType) {
		case "Diesel":
			return new DieselEngine();
		case "Petrol":
			return new PetrolEngine();
		case "Electric":
			return new ElectricEngine();
		default:
			throw new IllegalArgumentException("Unexpected value: " + engineType);
		}
	}

	@Override
	public Class<?> getObjectType() {
		return engineType.getClass();
	}
	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}

}
