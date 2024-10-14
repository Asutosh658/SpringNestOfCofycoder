package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cofig.SF_AppConfig;
import com.nt.sbeans.SeasonFinder;

public class Autowiring_SeasonFinder_Test {

	public static void main(String[] args) {
		    
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SF_AppConfig.class);
		     
		SeasonFinder sft =ctx.getBean("abc",SeasonFinder.class);
		 String Str= sft.generateSeason();
		  System.out.println("Current season ::"+Str);
		
		  ctx.close();

	}

}
