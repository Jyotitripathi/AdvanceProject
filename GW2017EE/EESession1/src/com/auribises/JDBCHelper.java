package com.auribises;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.tomcat.dbcp.dbcp2.cpdsadapter.PStmtKeyCPDS;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 

public class JDBCHelper {

	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	CallableStatement cStmt;
	
	// Default Constructor
	public JDBCHelper() {
		
		try {
			//1. Load the Driver. Before loading driver link jar file for Type4 Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	//2. Create the connection
	void openConnection(){
		try {
			String url = "jdbc:mysql://localhost/GW2017EE";
			String user = "root";
			String password = "";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Created--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	int registerUser(User u){
		int result = 0;
		try {
			//3. Write SQL Statement
			String sql = "insert into user values(null,?,?,?,?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, u.getEmail());
			pStmt.setString(2, u.getPassword());
			pStmt.setInt(3, u.getAge());
			pStmt.setInt(4, u.getSalary());
			
			result = pStmt.executeUpdate();
			System.out.println(u.getEmail()+ " registered successfully");
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
		return result;
	}
	
	boolean authenticateUser(User u){
		
		boolean flag = false;
		
		try {
			//3. Write SQL Statement
			String sql = "select * from user where email = ? and password = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, u.getEmail());
			pStmt.setString(2, u.getPassword());
			
			ResultSet rs = pStmt.executeQuery();
			
			flag = rs.next();
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
		
		return flag;
	}
	

	//5. Close the connection
	void closeConnection(){
		try {
			con.close();
			System.out.println("--Connection Closed--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	
}
