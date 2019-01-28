package com.Employee.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.Employee.dao.EmployeeDao;
import com.Employee.dbUtil.DBConnection;
import com.Employee.model.Employee;

public class EmpDaoImpl implements EmployeeDao {

	DBConnection dbConnection = new DBConnection();

	Connection conn = dbConnection.createConnection();

	public List<Employee> getAllEmployees() {

		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "SELECT * FROM TEmpD";
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setEmployeeId(res.getString("employeeId"));
				emp.setName(res.getString("name"));			
				emp.setSalary(res.getString("salary"));
				emp.setCountry(res.getString("country"));
				emp.setCity(res.getString("city"));
				emp.setZipCode(res.getInt("zipcode"));
				empList.add(emp);		
			}
			return empList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public Boolean addEmployee(Employee employee) {
		Connection con = null;

		Statement st = null;

		String insert = "insert into TEmpD values('" + employee.getName() + "', '" + employee.getEmployeeId()
				+ "', '" + employee.getSalary() + "', '" + employee.getCountry() + "', '" + employee.getCity() + "', '"
				+ employee.getZipCode() + "')";
		try
		{

			DBConnection dc = new DBConnection();

			con = dc.createConnection();

			st = con.createStatement();

			st.execute(insert);

			//System.out.println("Inserted");
			return true;

		}

		catch (Exception e)

		{

			System.out.println(e);

		}
		return null;

	}

	public Employee getEmployee(int empZ) {	
		
	//	DataSource ds = new DataSource();
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "SELECT * FROM TEmpD WHERE zipcode="+empZ;
			st = conn.createStatement();
			res = st.executeQuery(qry);
			Employee emp = new Employee();
			while(res.next())
			{
				
				emp.setName(res.getString("name"));
				emp.setEmployeeId(res.getString("employeeId"));
				emp.setSalary(res.getString("salary"));
				emp.setCountry(res.getString("country"));
				emp.setCity(res.getString("city"));
				emp.setZipCode(res.getInt("zipcode"));
				
				return emp;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public Boolean updateEmployee(Employee emp) {		
		Connection con = null;
		Statement st = null;
		String sql = "UPDATE TEmpD SET salary="+"'"+emp.getSalary()+"'"+"WHERE zipcode="
		+emp.getZipCode();
		try
		{
			DBConnection dc = new DBConnection();
			con = dc.createConnection();
			st = con.createStatement();
			st.execute(sql);
			//System.out.println("update");
			return true;
		}

		catch (Exception e)
		{
			System.out.println(e);
		}	
		return null;
	}
	
    public Boolean deleteEmployee(int emp) {

		Connection con = null;

		Statement st = null;

		String delete = "delete from TEmpD where zipcode="+emp;

		try

		{

			DBConnection dc = new DBConnection();

			con = dc.createConnection();

			st = con.createStatement();

			st.execute(delete);

			//System.out.println("deleted");
			return true;

		}

		catch (Exception e)

		{

			System.out.println(e);

		}
		return null;
	}

    public Boolean CreateTable(String sql) {
    	Connection con = null;
		Statement st = null;
		
		
		
		try {
			
			DBConnection dc = new DBConnection();
			 
			con = dc.createConnection();
			 
			st = con.createStatement();
			 
			st.execute(sql);
			 
			return true;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	return null;
    	
    }
	
	public List<Employee> innerJoin(){
		
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry ="SELECT TEmpD.employeeId, TEmpD.salary, TEmpE.age, TEmpE.mobile" + 
						" FROM TEmpE"+ 
						" INNER JOIN TEmpD ON TEmpD.zipcode=TEmpE.zipcode ";
			
			
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList2 = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setEmployeeId(res.getString("employeeId"));
				emp.setSalary(res.getString("salary"));
				emp.setAge(res.getString("age"));
				emp.setMobile(res.getString("mobile"));
				
				
				empList2.add(emp);
				
				
			}
			return empList2;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
		
	}
	
	public List<Employee> leftJoin(){
		
		Statement st = null;
		ResultSet res = null;
		
		try {
			
			
			String qry ="SELECT TEmpE.age, TEmpE.pId, TEmpD.zipcode" + 
					" FROM TEmpD" + 
					" LEFT JOIN TEmpE ON TEmpE.zipcode=TEmpD.zipcode";
			
			
			
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setAge(res.getString("age"));				
				emp.setpId(res.getInt("pId"));		
				emp.setZipCode(res.getInt("zipcode"));	
				empList.add(emp);		
			}
			return empList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
		
	}
	
	public List<Employee> rightJoin(){
		
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry ="SELECT Projects.projectId, Projects.pName, Employee.employeeId, Employee.name" + 
					" FROM Employee" + 
					" RIGHT JOIN Projects ON Projects.emloyeeId = Employee.employeeId;";
			
			String qry1 ="SELECT TEmpE.age, TEmpE.pId, TEmpD.zipcode" + 
					" FROM TEmpD" + 
					" RIGHT JOIN TEmpE ON TEmpE.zipcode=TEmpD.zipcode";
			
			
			st = conn.createStatement();
			res = st.executeQuery(qry1);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setAge(res.getString("age"));				
				emp.setpId(res.getInt("pId"));		
				emp.setZipCode(res.getInt("zipcode"));	
				empList.add(emp);
				
				
				empList.add(emp);
				
				
			}
			return empList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
		
	}
	
	public List<Employee> fullJoin(){
		
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry1 ="SELECT TEmpE.age, TEmpE.pId, TEmpD.zipcode" + 
					" FROM TEmpD" + 
					" RIGHT JOIN TEmpE ON TEmpE.zipcode=TEmpD.zipcode";
			
			
			st = conn.createStatement();
			res = st.executeQuery(qry1);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setAge(res.getString("age"));				
				emp.setpId(res.getInt("pId"));		
				emp.setZipCode(res.getInt("zipcode"));	
				empList.add(emp);
				
				
				empList.add(emp);
				
				
			}
			return empList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}
	
    public List<Employee> GroupByQueryCount(String qry) {
		
		
		Statement st = null;
		ResultSet res = null;
		
		try {
			
			
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setZipCode(res.getInt(1));
				
				emp.setCountry(res.getString("country"));				
				
				empList.add(emp);
				
				
			}
			return empList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
		
	}
	
	public List<Employee> GroupByQueryMax(String qry) {
		
		
		
		Statement st = null;
		ResultSet res = null;
		
		try {
			
			
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{

				Employee emp = new Employee();
				emp.setSalary(res.getString(1));
				
				emp.setCountry(res.getString("country"));				
				
				empList.add(emp);
				
				
			}
			return empList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
		
	}
	
public List<Employee> GroupByQuerySum(String qry) {
		
		
		
		Statement st = null;
		ResultSet res = null;
		
		try {
			
			
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				
				Employee emp = new Employee();
				emp.setZipCode(res.getInt(1));
				
				emp.setCountry(res.getString("country"));				
				
				empList.add(emp);
				
				
			}
			return empList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
		
	}
	
}
