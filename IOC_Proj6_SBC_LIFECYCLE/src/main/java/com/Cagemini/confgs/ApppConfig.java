package com.Cagemini.confgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.Capgemini.sbeans")
@PropertySource("com/Capgemini/commons/Info.properties")
public class ApppConfig {

}
