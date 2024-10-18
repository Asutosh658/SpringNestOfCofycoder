package com.nt;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.PatientDetails;

@SpringBootApplication
public class BootIocProj16DataInjectitonYmlApplication {

	public static void main(String[] args) {
	ApplicationContext ctx	=SpringApplication.run(BootIocProj16DataInjectitonYmlApplication.class, args);
	      PatientDetails patdetails=ctx.getBean("Pd",PatientDetails.class);
	      System.out.println(patdetails);
     
	
	}

}
