package com.Employee.dao;

import java.util.List;

import com.Employee.model.Employee;

public interface EmployeeDao {
	
	public List<Employee> getAllEmployees();
	
	public Boolean addEmployee(Employee emp);
	
	public Employee getEmployee(int empId);
	
	public Boolean updateEmployee(Employee emp);
	
	public Boolean deleteEmployee(int empId);
	

}
