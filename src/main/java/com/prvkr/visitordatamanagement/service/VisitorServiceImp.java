package com.prvkr.visitordatamanagement.service;

import java.sql.Connection;
import java.util.List;
import java.util.stream.Collectors;

import com.prvkr.visitordatamanagement.dao.VisitorDAOImp;
import com.prvkr.visitordatamanagement.dao.VisitorDao;
import com.prvkr.visitordatamanagement.dto.Visitor;
import com.prvkr.visitordatamanagement.util.AES;
import com.prvkr.visitordatamanagement.util.AppConstants;

public class VisitorServiceImp implements VisitorService{
	VisitorDao dao=null;
	public VisitorServiceImp() {
		dao= new VisitorDAOImp();
	}

	@Override
	public String saveVisitor(Visitor visitor) {
		String encContact=AES.encrypt(visitor.getContact(), AppConstants.SECRET_KEY);
		String encEmail=AES.encrypt(visitor.getEmail(), AppConstants.SECRET_KEY);
		String encAddress=AES.encrypt(visitor.getAdress(), AppConstants.SECRET_KEY);
		
		visitor.setContact(encContact);
		visitor.setEmail(encEmail);
		visitor.setAdress(encAddress);
		return dao.saveVisitor(visitor);
	}

	@Override
	public String updateVisitor(Visitor visitor) {
		return dao.updateVisitor(visitor);
	}

	@Override
	public Visitor deletVisitorById(int id) {
		return dao.deletVisitorById(id);
	}

	@Override
	public Visitor getVisitorById(int id) {
		Visitor visitor =dao.getVisitorById(id);
		String decContact=AES.decrypt(visitor.getContact(), AppConstants.SECRET_KEY);
		String decEmail=AES.decrypt(visitor.getEmail(), AppConstants.SECRET_KEY);
		String decAddress=AES.decrypt(visitor.getAdress(), AppConstants.SECRET_KEY);
		
		visitor.setContact(decContact);
		visitor.setEmail(decEmail);
		visitor.setAdress(decAddress);
		return visitor;
	}

	@Override
	public Visitor getVisitorBycontact(String contact) {
		String encContact=AES.encrypt(contact, AppConstants.SECRET_KEY);
		Visitor visitor =dao.getVisitorBycontact(encContact);
		
		String decContact=AES.decrypt(visitor.getContact(), AppConstants.SECRET_KEY);
		String decEmail=AES.decrypt(visitor.getEmail(), AppConstants.SECRET_KEY);
		String decAddress=AES.decrypt(visitor.getAdress(), AppConstants.SECRET_KEY);
		
		visitor.setContact(decContact);
		visitor.setEmail(decEmail);
		visitor.setAdress(decAddress);
		return visitor;
		
	}

	@Override
	public Visitor getVisitorByEmail(String email) {
		return dao.getVisitorByEmail(email);
	}

	@Override
	public List<Visitor> getAllVisitor() {
		List<Visitor> visitors=dao.getAllVisitor();
		return visitors.stream().map(e->{
			e.setName(e.getName().toUpperCase());
			e.setCourse(e.getCourse().toUpperCase());
			e.setDegree(e.getDegree().toUpperCase());
			e.setStream(e.getStream().toUpperCase());
			return e;
		}).collect(Collectors.toList());
	}

	@Override
	public List<Visitor> getVisitorDataSortedByName() {
		List<Visitor> visitors = getAllVisitor();
		return visitors.stream().sorted((e1,e2)-> {return e1.getName().compareToIgnoreCase(e2.getName());
		}).collect(Collectors.toList());
	}

	@Override
	public List<Visitor> getDegree() {
		List<Visitor> visitors = getAllVisitor();
		return visitors.stream().sorted((e1,e2)-> {return e1.getDegree().compareToIgnoreCase(e2.getDegree());
		}).collect(Collectors.toList());

	}

	@Override
	public Connection connectionGiver() {
		// TODO Auto-generated method stub
		return null;
	}

}
