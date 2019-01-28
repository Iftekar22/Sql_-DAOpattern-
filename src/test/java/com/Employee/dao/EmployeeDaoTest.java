package com.Employee.dao;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.Employee.Service.EmpDaoImpl;
import com.Employee.model.Employee;

public class EmployeeDaoTest {
	Employee emp = new Employee();

	EmployeeDao empDao = new EmpDaoImpl();

	@Test
	public void testGetAllEmployees() {

		List<Employee> empList = new ArrayList<Employee>();
		empList = empDao.getAllEmployees();
		
		assertEquals(empList.size(), 3);
	}

	@Test
	public void testAddEmployee() {

		emp.setEmployeeId("X006");
		emp.setName("bin");
		emp.setSalary("20000");
		emp.setCountry("Bangladesh");
		emp.setCity("Dhaka");
		emp.setZipCode(1200);

		//assertTrue(empDao.addEmployee(emp));
		assertEquals(true, empDao.addEmployee(emp));
		
		
	//	System.out.println(empDao.addEmployee(emp));
	}

	@Test
	public void testUpdateEmployee() {

		emp.setZipCode(1232);
		emp.setSalary("350000");

		assertTrue(empDao.updateEmployee(emp));
	}

	@Test
	public void testDeleteEmployee() {

		assertTrue(empDao.deleteEmployee(1200));
	}

}
