package com.Employee.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Employee.dao.PersonalDAO;
import com.Employee.dbUtil.DBConnection;
import com.Employee.model.Employee;
import com.Employee.model.Personal;

public class PnDaoImpl implements PersonalDAO {
	
	DBConnection dbConnection = new DBConnection();
	Connection conn = dbConnection.createConnection();
	
	public List<Personal> getAllPerson() {
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "SELECT * FROM TEmpE";
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Personal> pnList = new ArrayList<Personal>();
			
			while(res.next())
			{
				Personal pn = new Personal();
				pn.setZipcode(res.getInt("zipcode"));
				pn.setAge(res.getString("age"));
				pn.setpId(res.getInt("pId"));
				pn.setMobile(res.getString("mobile"));
				
				pnList.add(pn);		
			}
			return pnList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	
	public Boolean addPerson(Personal pn) {
		Connection con = null;

		Statement st = null;

		String insert = "insert into TEmpE values('" + pn.getZipcode()+ "', '" + pn.getAge()
				+ "', '" + pn.getpId()+ "', '" + pn.getMobile() + "')";
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
	
	public Personal getPerson(int pnZ) {	
		
		//	DataSource ds = new DataSource();
			Statement st = null;
			ResultSet res = null;
			
			try {
				String qry = "SELECT * FROM TEmpE WHERE zipcode="+pnZ;
				st = conn.createStatement();
				res = st.executeQuery(qry);
				Personal pn = new Personal();
				while(res.next())
				{					
					pn.setZipcode(res.getInt("zipcode"));
					pn.setAge(res.getString("age"));
					pn.setpId(res.getInt("pId"));
					pn.setMobile(res.getString("mobile"));
					
					return pn;
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return null;
	  }
	
	public Boolean updatePerson(Personal pn) {		
		Connection con = null;
		Statement st = null;
		String sql = "UPDATE TEmpE SET mobile="+"'"+pn.getMobile()+"'"+"WHERE zipcode="
		+pn.getZipcode();
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

	 public Boolean deletePerson(int pId) {

			Connection con = null;

			Statement st = null;

			String delete = "delete from TEmpE where zipcode="+pId;

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

	


}
