package com.Employee.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.Employee.Service.EmpDaoImpl;
import com.Employee.model.Employee;

public class EmployeeDaoTest {

	@Test
	public void testGetAllEmployees() {
		Employee emp = new Employee();
		
		EmployeeDao empDao = new EmpDaoImpl();
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList = empDao.getAllEmployees();
		
		assertEquals(empList.size(),3);
	}

	@Test
	public void testAddEmployee() {
		Employee emp = new Employee();
		
		EmployeeDao empDao = new EmpDaoImpl();
		
		emp.setEmployeeId("X005");
		emp.setName("Robin");
		emp.setSalary("20000");
		emp.setCountry("Bangladesh");
		emp.setCity("Dhaka");
		emp.setZipCode(1200);
	
		
		assertTrue(empDao.addEmployee(emp));
	}


	@Test
	public void testUpdateEmployee() {
		Employee emp = new Employee();	
		EmployeeDao empDao = new EmpDaoImpl();	
		emp.setZipCode(1232);
		emp.setSalary("350000");
		
		assertTrue(empDao.updateEmployee(emp));
	}

	@Test
	public void testDeleteEmployee() {
     EmployeeDao empDao = new EmpDaoImpl();	
	 assertTrue(empDao.deleteEmployee(1200));
	}

}
