package com.nt.main;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class AutowiringTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator generator_1=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator_2=ctx.getBean("wmg",WishMessageGenerator.class);
		//String str=generator.generateLtime("Syrus");
		//System.out.println("result ::"+str);
		System.out.println("generator_1==generator_2::"+(generator_1==generator_2));
		System.out.println("generator_1 hashcode:: "+generator_1.hashCode());
		System.out.println("generator_2 hashcode:: "+generator_1.hashCode());
		
		System.out.println("********************************************************");
		
		LocalDate LD= ctx.getBean("ldate",LocalDate.class);
		LocalDate LD1= ctx.getBean("ldate",LocalDate.class);
		
		System.out.println("LD1==Ld::"+(LD==LD1));
		
		
		
		ctx.close();
	}

}
