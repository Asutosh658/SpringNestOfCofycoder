package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("empd")
@Data
@ConfigurationProperties(prefix = "emp")
public class Employee_Details {
  
	
	private Integer id;
	@Value("${emp.name1}")
	private String name;
	private String addrs;
	
	private String gender;
	private String mail;
	
	
	
}
