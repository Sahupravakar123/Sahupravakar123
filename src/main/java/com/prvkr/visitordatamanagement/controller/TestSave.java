package com.prvkr.visitordatamanagement.controller;

import com.prvkr.visitordatamanagement.dao.VisitorDAOImp;
import com.prvkr.visitordatamanagement.dao.VisitorDao;
import com.prvkr.visitordatamanagement.dto.Visitor;

public class TestSave {

	public static void main(String[] args) {
		Visitor visitor = new Visitor();
		visitor.setName("Tiru");
		visitor.setAdress("Andhra");
		visitor.setContact("7077158968");
		visitor.setCourse("civil");
		visitor.setDegree("b.tech");
		visitor.setStream("CIVIL");
		visitor.setThroughtoutpercentage("58.2");
		visitor.setYearofpassout(2021);
		visitor.setGender("male");
		visitor.setEmail("tiru123@gmail.com");
		
		VisitorDao dao=new VisitorDAOImp();
		System.out.println(dao.saveVisitor(visitor));
	
	}

}
