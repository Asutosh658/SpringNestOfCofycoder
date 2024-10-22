package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDao;
import com.nt.model.Employee;
@Service("eservice")
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
		
		list.forEach(empdetails->{
			empdetails.setGrossSalary(empdetails.getSalary()+(empdetails.getSalary()*0.5));
		    empdetails.setNetSalary(empdetails.getGrossSalary()-(empdetails.getGrossSalary()*0.4));
		
		});
		
		return list;
		 
	 }
}
