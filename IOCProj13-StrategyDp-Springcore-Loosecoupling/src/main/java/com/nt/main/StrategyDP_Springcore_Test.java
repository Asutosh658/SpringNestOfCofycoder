package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.Appconfig;
import com.nt.sbeans.BlueDart;
import com.nt.sbeans.Flipkart;

public class StrategyDP_Springcore_Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		String Str = fpkt.shopping(new String[] {"dress","bike"},new double[] {5000.00,200000.00});
		System.out.println(Str);

	}

}
