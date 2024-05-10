package com.prvkr.visitordatamanagement.dao;

import java.sql.Connection;
import java.util.List;

import com.prvkr.visitordatamanagement.dto.Visitor;

public interface VisitorDao {
	
    public Connection connectionGiver();
	public String saveVisitor(Visitor visitor);
	public String updateVisitor(Visitor visitor);
	public Visitor deletVisitorById(int id);
	public Visitor getVisitorById(int id);
	public Visitor getVisitorBycontact(String contact);
	public Visitor getVisitorByEmail(String email);
	public List<Visitor> getAllVisitor();
	
	
}
