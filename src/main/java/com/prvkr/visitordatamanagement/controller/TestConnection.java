package com.prvkr.visitordatamanagement.controller;

import com.prvkr.visitordatamanagement.dao.VisitorDAOImp;
import com.prvkr.visitordatamanagement.dao.VisitorDao;
import com.prvkr.visitordatamanagement.dto.Visitor;

public class TestConnection {

	public static void main(String[] args) {
		VisitorDao dao=new VisitorDAOImp();
		System.out.println(dao.saveVisitor(new Visitor()));
	}

}
