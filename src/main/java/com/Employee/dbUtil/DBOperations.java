package com.Employee.dbUtil;

import com.Employee.Service.EmpDaoImpl;
import com.Employee.dao.EmployeeDao;
import com.Employee.model.Employee;

public class DBOperations {
	
	public static void main(String[] args) {

		Employee emp = new Employee();

		EmployeeDao empDao = new EmpDaoImpl();

//		emp.setName(" Anik");
//		emp.setEmployeeId("X002");
//		emp.setSalary("50000.00");
//		emp.setCountry("Bangladesh");
//		emp.setCity("Rajshahi");
//		emp.setZipCode(1252);
//
//		empDao.addEmployee(emp);
//		
//		empDao.deleteEmployee(1252);
//		
//        Employee emp2 = empDao.getEmployee(1242);
//		System.out.println("Employee Detail: \n\nEmployee Name: "+emp2.getName()+
//				"\nId: "+emp2.getEmployeeId()+"\nSalary: "+emp2.getSalary()
//				+"\nCountry: "+emp2.getCountry()+"\nCity: "+emp2.getCity()
//				+"\nZip Code: "+emp2.getZipCode());
				
		
//		emp.setZipCode(1252);
//		emp.setSalary("150000.50");
//		empDao.updateEmployee(emp);
		
		//Employee emp2 = empDao.getEmployee(1242);
		
//		for(Employee employee:empDao.getAllEmployees()) {
//			System.out.println("employee: [ Employee ID:"+employee.getEmployeeId()
//			+", Name:"+employee.getName()+", Salary:"+employee.getSalary()
//			+", Country:"+employee.getCountry()+", City:" +employee.getCity()+",ZipCode:"
//			+employee.getZipCode()+" ]");}

  }
}
