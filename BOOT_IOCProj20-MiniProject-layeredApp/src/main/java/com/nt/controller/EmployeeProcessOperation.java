package com.nt.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;
@Controller("econtroller")
public class EmployeeProcessOperation {

	@Autowired
	private IEmployeeService eservice;
	public List<Employee> employeeDetailsProcess(String desg1,String desg2,String desg3)throws Exception
	{
		List<Employee> list=eservice.fetchEmployeeDetails(desg1, desg2, desg3);
		
		return list;
		
	}
	
}
