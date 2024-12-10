package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EmployeeOperationController {
	
	@Autowired
	private IEmployeeService empService;
	
	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	
	@GetMapping("/report")
	public String ShowEmployeeDetails(Map<String,Object>map)
	{
		List<Employee> list=empService.showAllEmployee();
		map.put("Emplist",list);
		
		
		return "show_report";
	}
	

}
