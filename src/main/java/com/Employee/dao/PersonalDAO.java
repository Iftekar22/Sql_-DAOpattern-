package com.Employee.dao;

import java.util.List;

import com.Employee.model.Employee;
import com.Employee.model.Personal;

public interface PersonalDAO {
	
	public List<Personal> getAllPerson();
	
	public Boolean addPerson(Personal pn);
	
	public Personal getPerson(int pId);
	
	public Boolean updatePerson(Personal pn);
	
	public Boolean deletePerson(int pId);
	
	

}
