package com.prvkr.visitordatamanagement.dao;

import com.prvkr.visitordatamanagement.dto.Admin;

public interface AdminDAO {
	public String saveAdmin(Admin admin);
	public String adminLogin(String userName, String password);
}
