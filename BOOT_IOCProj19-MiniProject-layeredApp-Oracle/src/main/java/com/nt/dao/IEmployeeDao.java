package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDao {
	
	public List<Employee> getEmployeeDetails(String desg1,String desg2,String desg3)throws Exception;
	
	public int saveEmployeeDetails(Employee emp) throws Exception;

}
