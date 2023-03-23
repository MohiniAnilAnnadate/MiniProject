package com.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User_Login {
	 
 public static void userLogin(String username, String passwords) throws SQLException {
	 Connection cnn;
	 try {
		cnn = AllConnection.getConnection();
		  String sql = "SELECT * FROM user WHERE username=? AND passwords=?";
          PreparedStatement pstmt = cnn.prepareStatement(sql);
          pstmt.setString(1, username);
          pstmt.setString(2, passwords);
          // Execute select statement
          ResultSet rs = pstmt.executeQuery();
          
          // Check if user exists
          if (rs.next()) {
              System.out.println("USER LOGGING IS SUCCESSFULLY...");
          } else {
              System.out.println("INVALID USERNAME OR PASSWORD.");
          }
          
          // Close resources
          rs.close();
          pstmt.close();
          cnn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 
	 	 
	 
 }
	
	
public static void userInput() throws SQLException{
	   
Scanner sc=new Scanner(System.in);

System.out.println("PLEASE ENTER VALID USERNAME");
String username=sc.next();
System.out.println("PLEASE ENTER VALID PASSWORD");
String passwords=sc.next();
userLogin(username,passwords);	
	
	
}
	
	
	
	
	
	
	
	
	
}
