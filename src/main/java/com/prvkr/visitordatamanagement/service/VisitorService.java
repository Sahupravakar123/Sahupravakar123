package com.prvkr.visitordatamanagement.service;

import java.sql.Connection;
import java.util.List;

import com.prvkr.visitordatamanagement.dto.Visitor;

public interface VisitorService {
	public Connection connectionGiver();
	
	public String saveVisitor(Visitor visitor);
	
	public String updateVisitor(Visitor visitor);
	
	public Visitor deletVisitorById(int id);
	
	public Visitor getVisitorById(int id);
	
	public Visitor getVisitorBycontact(String contact);
	
	public Visitor getVisitorByEmail(String email);
	
	public List<Visitor> getAllVisitor();
	
	public List<Visitor> getVisitorDataSortedByName();
	
	public List<Visitor> getDegree();
	
	
}
