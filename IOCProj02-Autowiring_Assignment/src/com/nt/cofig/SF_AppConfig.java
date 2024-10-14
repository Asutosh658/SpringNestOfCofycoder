package com.nt.cofig;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class SF_AppConfig {
	
	@Bean(name="ldate")
	public LocalDate createlDate()
	{  
		return LocalDate.now();
	}
  
}
