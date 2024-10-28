package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee_Details;

@SpringBootApplication
public class BootIocProj15DataInjectionConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootIocProj15DataInjectionConfigurationPropertiesAnnotationApplication.class, args);
	 Employee_Details emp=ctx.getBean("empd",Employee_Details.class);
	 System.out.println(emp);
	 
	 ((ConfigurableApplicationContext) ctx).close();
	
	}

}
