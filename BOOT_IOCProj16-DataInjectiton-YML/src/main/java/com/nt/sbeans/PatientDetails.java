package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("Pd")
@ConfigurationProperties(prefix = "hospital.apolo.pat")
@Data
public class PatientDetails {

	 private Integer id;
	 private String name;
	 private String gender;
	 private String address;
	 

	
	
}
