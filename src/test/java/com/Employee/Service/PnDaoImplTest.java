package com.Employee.Service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import com.Employee.dao.PersonalDAO;
import com.Employee.model.Personal;

public class PnDaoImplTest {
	
	Personal pn = new Personal();

	PersonalDAO pnDao = new PnDaoImpl();

	@Test
	public void testGetAllPerson() {

		List<Personal> pnList = new ArrayList<Personal>();
		pnList = pnDao.getAllPerson();
		
		assertEquals(pnList.size(), 2);
	}

	@Test
	public void testAddPerson() {
		
		pn.setZipcode(1262);
		pn.setAge("40");
		pn.setpId(104);
		pn.setMobile("0110000");

		assertTrue(pnDao.addPerson(pn));
	}

	@Test
	public void testUpdatePerson() {
		pn.setZipcode(1232);
		pn.setMobile("014000000");

		assertTrue(pnDao.updatePerson(pn));
	}

	@Test
	public void testDeletePerson() {
		assertTrue(pnDao.deletePerson(1232));
		
		
	}

}
