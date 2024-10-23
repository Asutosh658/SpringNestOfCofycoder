package com.nt.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository("empdao")
public class EmployeeDaoImpl implements IEmployeeDao {
	private static final String getEmpDetailsQuery="select empno,ename,job,sal,deptno from emp where job in (?,?,?) ";	
	@Autowired
	private DataSource ds;
	
	@Override
	public List<Employee> getEmployeeDetails(String desg1,String desg2,String desg3) throws Exception {
	  
		List<Employee> list=null;
		try(Connection con = ds.getConnection();
				PreparedStatement ps= con.prepareStatement(getEmpDetailsQuery) ;)
		{
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			
			try(ResultSet rs = ps.executeQuery();)
			{  
				list=new ArrayList<Employee>();
				while(rs.next())
				{
					 Employee emp= new Employee();
					emp.setEmpId(rs.getInt(1));
					emp.setEName(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptNo(rs.getInt(5));
					list.add(emp);
				}
			}//try1
		}//try2
		catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle ;
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return list;
	}

}
