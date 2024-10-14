package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class Appconfig_LocalDateTime {
	
	@Bean
	public LocalDateTime createLocaldatetime()
	{
		return LocalDateTime.now();
	}

}
