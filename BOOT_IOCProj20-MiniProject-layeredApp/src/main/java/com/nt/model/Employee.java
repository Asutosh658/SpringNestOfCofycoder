package com.nt.model;

import lombok.Data;

@Data
public class Employee {
    private Integer empId;
    private String eName;
    
    private Double salary;
    private String job;
    private Integer DeptNo;
    
    private Double grossSalary;
    private Double netSalary;
    
    
}
