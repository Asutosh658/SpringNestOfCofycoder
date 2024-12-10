package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Table(name="emp")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Employee {
    
	
	
	@Id
	@SequenceGenerator(name="gen1", sequenceName = "emp_eno_seq",initialValue =1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer empno;
	
	@Column
	@NonNull
	private String ename;
	
	@Column
	@NonNull
	private String job;
	
	@Column
	@NonNull
	private Double sal;
	
	@Column
	@NonNull
	private Integer deptno;
	
	
}