package com.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin_Login {
public static void  Admin(String Product, int ProductQuantity, String mailId) throws SQLException {
	Connection cnn;
	 cnn = AllConnection.getConnection();
	  PreparedStatement stmt = cnn.prepareStatement("insert into Cart(Product,ProductQuantity) values(?,?)");
	    stmt.setString(1, Product);
	    stmt.setInt(2,ProductQuantity);
	      
	    System.out.println("add product in cart is successfull..."); 
	    
	
	    System.out.println("checking perticular user to verify...");
	    String sql = "select * from user where mailID=?";
		 PreparedStatement pstmt = cnn.prepareStatement(sql);			  
		 pstmt.setString(1, mailId);
		 // Execute select statement
ResultSet rs = pstmt.executeQuery();
		  if(rs.next()) {
			  System.out.println("Id>>" +rs.getInt(1));
			  System.out.println("firstname>>"+ rs.getString(2));
			  System.out.println("lastname>>"+ rs.getString(3));
			  System.out.println("mobileNO>>"+ rs.getString(8));
			  
		  }else {
			  System.out.println("register user is not exists");
		  }
		    stmt.execute();
}
public static void userInput() throws SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the product to add in cart");
	String Product=sc.next();
	
	System.out.println("enter the product quantity ");
	int ProductQuantity =sc.nextInt();
	
	System.out.println("please enter Email");
	String mailId=sc.next();
	Admin(Product, ProductQuantity,mailId);
	
}
}








