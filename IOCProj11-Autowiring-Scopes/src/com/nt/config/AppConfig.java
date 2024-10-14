package com.nt.config;

import java.time.LocalDate;


import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages ="com.nt.sbeans")
public class AppConfig {
	
	public AppConfig()
	{
		System.out.println("AppConfig.AppConfig() 0-param constructor");
	}
	
    @Bean(name = "ltime")
    
	public LocalTime creatLtime() {
 
		return LocalTime.now();
	}
    
    @Bean(name="ldate")
    @Scope("prototype")
	public LocalDate createlDate()
	{  
		return LocalDate.now();
	}
}