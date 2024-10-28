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
public class BootIocProj19MiniProjectLayeredAppOracleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj19MiniProjectLayeredAppOracleApplication.class, args);
		EmployeeProcessOperation epo= ctx.getBean("econtroller",EmployeeProcessOperation.class);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter Desg1::");
		String desg1=sc1.next();
		System.out.println("enter Desg2::");
		String desg2=sc1.next();
		System.out.println("enter Desg3::");
		String desg3=sc1.next();
		  
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Employee name ");
		String ename= sc.nextLine();
		System.out.println("enter employee job ");
		String ejob = sc.nextLine();
		System.out.println("enter employee salary ");
		Double esal= Double.parseDouble(sc.nextLine());
		System.out.println("enter employee dept no bet (10,20,30,40)");
		int deptno=Integer.parseInt(sc.nextLine());
		
		
		
		
		try {
			List<Employee> list=epo.employeeDetailsProcess(desg1, desg2, desg3);
			list.forEach(emp->{System.out.println(emp);});
			Employee emp2 = new Employee();
			emp2.setEName(ename);
			emp2.setJob(ejob);
			emp2.setSalary(esal);
			emp2.setDeptNo(deptno);
			
			String Str=epo.empcontrolprocess(emp2);
			
			System.out.println(Str);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("try after Sometime");
		}
	
		//sc.close();
		((ConfigurableApplicationContext) ctx).close();
		sc.close();
	}

}
