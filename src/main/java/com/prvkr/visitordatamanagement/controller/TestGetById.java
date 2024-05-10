package com.prvkr.visitordatamanagement.controller;

import com.prvkr.visitordatamanagement.service.VisitorService;
import com.prvkr.visitordatamanagement.service.VisitorServiceImp;

public class TestGetById {
	public static void main(String[] args) {
		VisitorService service=new VisitorServiceImp();
		System.out.println(service.getVisitorBycontact("7381116789"));
	}
}
