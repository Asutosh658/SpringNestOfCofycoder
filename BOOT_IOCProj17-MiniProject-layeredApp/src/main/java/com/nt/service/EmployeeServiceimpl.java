package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDao;
import com.nt.model.Employee;
@Service("empser")
public class EmployeeServiceimpl implements IEmployeeService {
	@Autowired
	 private IEmployeeDao impd;
  
	 public List<Employee> fetchEmployeeDetails(String desg1,String desg2,String desg3)throws Exception
	 {
		 List<Employee> list=impd.getEmployeeDetails(desg1, desg2, desg3);
		 
		desg1= desg1.toUpperCase();
		desg2= desg2.toUpperCase();
		desg3= desg3.toUpperCase();
		
		list.sort((t1,t2)->t1.getEmpId().compareTo(t2.getEmpId()));
		
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.5));
		    emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.4));
		
		});
		
		return list;
		 
	 }
}
