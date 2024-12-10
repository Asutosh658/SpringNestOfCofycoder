package com.nt.service;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.IEmployeerepository;
@Service
public class EmployeeManagementIMPL implements IEmployeeService {
	
	@Autowired
	private IEmployeerepository empRepo;

	@Override
	public List<Employee> showAllEmployee() {
		
		  // this is natural sorting through stream support 
		     List<Employee>list=StreamSupport.stream( empRepo.findAll().spliterator(), false).toList();
		    //  return list.stream().sorted().toList();
		  // i need to develop my condition based sorting 
		      //then we have to do this 
		     return list.stream().sorted((emp1,emp2)->emp1.getEname().compareTo(emp2.getEname())).toList();
		     
		      
	}

}
