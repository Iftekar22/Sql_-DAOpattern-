package com.Employee.dbUtil;

import java.util.ArrayList;
import java.util.List;

//import com.Personal.Service.PnDaoImpl;
import com.Employee.Service.EmpDaoImpl;
import com.Employee.Service.PnDaoImpl;
import com.Employee.dao.EmployeeDao;
import com.Employee.dao.PersonalDAO;
import com.Employee.model.Employee;
import com.Employee.model.Personal;

public class DBOperations {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Personal pn = new Personal();

		EmployeeDao empDao = new EmpDaoImpl();
		PersonalDAO pnDao = new PnDaoImpl();

//		pn.setZipcode(1200);
//		pn.setAge("20");
//		pn.setpId(103);
//		pn.setMobile("01900000000");
//		
//		pnDao.addPerson(pn);

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

		// Employee emp2 = empDao.getEmployee(1242);

//		for(Employee employee:empDao.getAllEmployees()) {
//			System.out.println("employee: [ Employee ID:"+employee.getEmployeeId()
//			+", Name:"+employee.getName()+", Salary:"+employee.getSalary()
//			+", Country:"+employee.getCountry()+", City:" +employee.getCity()+",ZipCode:"
//			+employee.getZipCode()+" ]");}

//		for(Personal pn1:pnDao.getAllPerson()) {
//		System.out.println("Pertson: [ Person ZipCodeI:"+pn1.getZipcode()
//		+", Age:"+pn1.getAge()+", Person Id:"+pn1.getpId()
//		+", Mobile number:"+pn1.getMobile()+" ]");}

//		Personal pn2=pnDao.getPerson(1232);
//		
//		System.out.println("Personal Detail: \n\nPerson zipcode: "+pn2.getZipcode()+
//		"\nAge: "+pn2.getAge()+"\npId: "+pn2.getpId()
//		+"\nMobile: "+pn.getMobile());

//		pn.setMobile("013000");	
//		pn.setZipcode(1200);
//		pnDao.updatePerson(pn);

		//Employee emp2 = empDao.getEmployee(1242);

		// pnDao.deletePerson(1200);

//		List<Employee> empList = new ArrayList<Employee>();
//
//		empList = empDao.innerJoin();
//
//		
//		  for(Employee emp2 : empList ) {
//		  System.out.println("Inner Join: \n\nEmployee ID: "+emp2.getEmployeeId()
//		  +"\nEmployee salary: "+emp2.getSalary()+"\nage "+emp2.getAge()
//		  +"\nmobile: "+emp2.getMobile()+"\n\n"); }
//		
//	     empList = empDao.leftJoin();
//	     
//		for (Employee emp2 : empList) {
//			System.out.println("Left Join: \n\nEmployee age: "+ emp2.getAge() + "\npId: "
//		+ emp2.getpId()
//			+ "\nTEMP3 zip: " + emp2.getZipCode()+ "\n\n");
//			
//		}
//		
//		empList = empDao.fullJoin();
//	     
//		for (Employee emp2 : empList) {
//			System.out.println("full Join: \n\nEmployee age: "+ emp2.getAge() + "\npId: "
//		+ emp2.getpId()
//			+ "\nTEMP3 zip: " + emp2.getZipCode()+ "\n\n");
//			
//		}
		
//		System.out.println("Count employees from each cities:\n\n");
//		String qry = "SELECT COUNT(zipcode), country"
//				+ " FROM TEmpD"
//				+ " GROUP BY country";
//		
//		System.out.println("Zipcode Counts\t\tCountry Name\n");
//		
//		for(Employee emp2 : empDao.GroupByQueryCount(qry) )
//		{
//			System.out.println(emp2.getZipCode()+"\t\t\t"+emp2.getCountry()+"\n\n");
//		}
		
//		System.out.println("Count[order by ASC] employees from each Countries:\n\n");
//		String qryy = "SELECT COUNT(Zipcode), country"
//				+ " FROM TEmpD"
//				+ " GROUP BY country"
//				+ " ORDER BY COUNT(zipcode) ASC";
//		
//		System.out.println("Zipcode Counts\t\tcountry Name\n");
//		
//		for(Employee emp2 : empDao.GroupByQueryCount(qryy) )
//		{
//			System.out.println(emp2.getZipCode()+"\t\t\t"+emp2.getCountry()+"\n\n");
//		}
		
//		System.out.println("Count[Having] employees from each countries:\n\n");
//		String qryx = "SELECT COUNT(zipcode), country"
//				+ " FROM TEmpD"
//				+ " GROUP BY country"
//				+ " HAVING COUNT(zipcode) < 3";
//		
//		System.out.println("Employee Counts\t\tCountry Name\n");
//		
//		for(Employee emp2 : empDao.GroupByQueryCount(qryx) )
//		{
//			System.out.println(emp2.getZipCode()+"\t\t\t"+emp2.getCountry()+"\n\n");
//		}
		
//		String qry2 = "SELECT MAX(salary),country"
//				+ " FROM TEmpD"
//				+ " GROUP BY country";
//		
//		System.out.println("Max salary from each country:\n\n");
//		
//		System.out.println("Employee Salary\t\tCountry Name\n");
//		
//		for(Employee emp2 : empDao.GroupByQueryMax(qry2) )
//		{
//			System.out.println(emp2.getSalary()+"\t\t\t"+emp2.getCountry()+"\n\n");
//		}
		
//		String qry3 = "SELECT MIN(salary),country"
//				+ " FROM TEmpD"
//				+ " GROUP BY country";
//		
//		System.out.println("MIN salary from each country:\n\n");
//		
//		System.out.println("Employee Salary\t\tcountry Name\n");
//		
//		for(Employee emp2 : empDao.GroupByQueryMax(qry3) )
//		{
//			System.out.println(emp2.getSalary()+"\t\t\t"+emp2.getCountry()+"\n\n");
//		}

		String qry4 = "SELECT SUM(zipcode),country"
				+ " FROM TEmpD"
				+ " GROUP BY country";
		
		System.out.println("SUM salary country wise:\n\n");
		
		System.out.println("Employee Salary\t\tcountry Name\n");
		
		for(Employee emp2 : empDao.GroupByQuerySum(qry4) )
		{
			System.out.println(emp2.getZipCode()+"\t\t\t"+emp2.getCountry()+"\n\n");
		}
	}
}
