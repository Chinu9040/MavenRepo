package com.practice.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("com/practice/commons/EInfo.properties")
@ComponentScan(basePackages = {"com.practice.sbeans","com.practice.factorybeans"})

public class AppConfig {

}
