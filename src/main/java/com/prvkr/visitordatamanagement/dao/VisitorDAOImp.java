package com.prvkr.visitordatamanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.prvkr.visitordatamanagement.dto.Visitor;
import com.prvkr.visitordatamanagement.util.ConnectionUtil;

public  class VisitorDAOImp implements VisitorDao {
	
	private static Connection connection = ConnectionUtil.connectionGiver();
	@Override
	public String saveVisitor(Visitor visitor) {
		if(connection!=null) {
			String query="INSERT INTO visitor ( `id` ,`name`, `contact`, `email`, `degree`, `stream`, `throught_persantage`, `year_of_passout`, `course`, `gender`, `address`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement ps=connection.prepareStatement(query);
				ps.setInt(1, visitor.getId());
				ps.setString(2, visitor.getName());
				ps.setString(3, visitor.getContact());
				ps.setString(4, visitor.getEmail());
				ps.setString(5, visitor.getDegree());
				ps.setString(6, visitor.getStream());
				ps.setString(7, visitor.getThroughtoutpercentage());
				ps.setInt(8, visitor.getYearofpassout());
				ps.setString(9, visitor.getCourse());
				ps.setString(10, visitor.getGender());
				ps.setString(11, visitor.getAdress());
				
				int res=ps.executeUpdate();
				return "no of rows added"+res;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return"connected succesfully";
		}
		return "something went wrong";
	}
	@Override
	public String updateVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public  Visitor deletVisitorById(int id) {
		Visitor visitor=null;
		String query="SELECT * FROM viitor where id=?";
		if(connection!=null) {
			try {
				visitor=new Visitor();
				PreparedStatement ps=connection.prepareStatement(query);
				ps.setInt(1, id);
				ResultSet resultset=ps.executeQuery();
				if(resultset.next()) {
					visitor.setId(resultset.getInt(1));
					visitor.setName(resultset.getString(2));
				}
				return visitor;
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	@Override
	public Visitor getVisitorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Visitor getVisitorBycontact(String contact) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Visitor getVisitorByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Visitor> getAllVisitor() {
		String query="SELECT * FROM viitor ";
		if(connection!=null) {
			try {
				List<Visitor> list=new ArrayList();
				PreparedStatement ps=connection.prepareStatement(query);
				ResultSet resultset=ps.executeQuery();
				while(resultset.next()) {
					Visitor visitor= new Visitor();
					visitor.setId(resultset.getInt(1));
					visitor.setName(resultset.getString(2));
				}
				return list;
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	@Override
	public Connection connectionGiver() {
		// TODO Auto-generated method stub
		return null;
	}
}

