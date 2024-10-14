package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.Appconfig_LocalDateTime;
import com.nt.sbeans.Dayofweek_Finder;

public class Autowiring_LocalDateTime_Test {

	public static void main(String[] args) {
		Class<Appconfig_LocalDateTime> alt= Appconfig_LocalDateTime.class;
		//creating IOC container 
	   AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(alt);
	   
	            Dayofweek_Finder dwf1  =ctx.getBean("dwf",Dayofweek_Finder.class);
	            String str=dwf1.dayFinder();
	            //for output for Days of week 
	            System.out.println(str);
	            
	            //for closing IOC Container
	            ctx.close();
	}

}
