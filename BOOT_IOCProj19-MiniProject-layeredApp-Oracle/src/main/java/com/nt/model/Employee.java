package com.nt.model;

import lombok.Data;

@Data
public class Employee {

	 private Integer empId;
	    private String eName;
	    private String job;
	    private Double Salary;
	    private Integer DeptNo;
	    
	    private Double grossSalary;
	    private Double netSalary;
}
