package com.prvkr.visitordatamanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection connectionGiver() {
		
		try {
			Class.forName(AppConstants.DRIVER);
			return DriverManager.getConnection(AppConstants.URL ,AppConstants.USER ,AppConstants.PASSWORD );
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
