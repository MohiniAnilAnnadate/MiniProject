package com.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User_Regestration {
public static void registerUser(String firstname,String lastname,String username,String passwords,String city,String mailId,String mobileNo) {
	    Connection cnn;
		try {
			cnn = AllConnection.getConnection();
			  PreparedStatement stmt = cnn.prepareStatement("insert into user(firstname,lastname,username,passwords,city,mailId,mobileNo)values(?,?,?,?,?,?,?)");
			    stmt.setString(1, firstname);
			    stmt.setString(2, lastname);
			    stmt.setString(3, username);
			    stmt.setString(4, passwords);
			    stmt.setString(5, city);
			    stmt.setString(6, mailId);
			    stmt.setString(7, mobileNo);
			    stmt.execute();
			    System.out.println("user record successfull...");
			   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	}
	
	public static void userInput() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("PLEASE ENTER FIRST NAME");
		String firstname=sc.next();
		
	
		System.out.println("PLEASE ENTER LAST NAME");
		String lastname=sc.next();
		
		
		System.out.println("PLEASE ENTER USERNAME");
		String username=sc.next();
		

		System.out.println("PLEASE ENTER PASSWORD");
		String passwords=sc.next();

		System.out.println("PLEASE ENTER CITY");
		String city=sc.next();

		System.out.println("PLEASE ENTER MAIL ID");
		String mailId=sc.next();
		
	
		System.out.println("PLEASE ENTER MOBILE NUMBER");
		String mobNo=sc.next();
		
		registerUser(firstname, lastname, username, passwords, city,mailId, mobNo);
	}
}
