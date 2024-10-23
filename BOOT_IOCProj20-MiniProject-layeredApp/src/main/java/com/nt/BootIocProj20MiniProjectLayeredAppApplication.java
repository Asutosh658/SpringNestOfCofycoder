package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmployeeProcessOperation;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProj20MiniProjectLayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj20MiniProjectLayeredAppApplication.class, args);
		EmployeeProcessOperation epo=ctx.getBean("econtroller",EmployeeProcessOperation.class);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Desg1::");
		String desg1=sc.nextLine();
		System.out.println("enter Desg2::");
		String desg2=sc.nextLine();
		System.out.println("enter Desg3::");
		String desg3=sc.nextLine();
		
		
		try {
			List<Employee> list=epo.employeeDetailsProcess(desg1, desg2, desg3);
			list.forEach(emp->System.out.println(emp));
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("try after Sometime");
		}
		
		
		((ConfigurableApplicationContext) ctx).close();
		sc.close();
	}
	

}


