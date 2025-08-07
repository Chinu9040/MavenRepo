package com.LB.Cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.LB.Sbeans")
@PropertySource("com/LB/common/einfo.properties")
@ImportResource("com/LB/cfgs/applicationContext.xml")
public class AppConfig {
	

}
