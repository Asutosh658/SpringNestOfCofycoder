package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class AutowiringTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		String str=generator.generateLtime("Syrus");
		System.out.println("result ::"+str);
	//	WishMessageGenerator generator1=ctx.getBean("wmg",WishMessageGenerator.class);
		String str1=generator.generateSeason();
		System.out.println("result ::"+str1);
		ctx.close();
	}

}
