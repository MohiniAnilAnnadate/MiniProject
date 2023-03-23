package com.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Products {
		public static void product(int id) throws SQLException {
				 Connection cnn;
				 cnn = AllConnection.getConnection();
				 String sql = "select * from products where ProductId = ?";
				 PreparedStatement pstmt = cnn.prepareStatement(sql);
				 pstmt.setInt(1, id);
				  
				
				 // Execute select statement
	ResultSet rs = pstmt.executeQuery();
				  while(rs.next()) {
					  System.out.println("Id>>" +rs.getInt(1));
					  System.out.println("Product Name>>"+ rs.getString(2));
					  System.out.println("Product Discription>>"+ rs.getString(3));
					  System.out.println("Available Quantitiy>>"+ rs.getInt(4));
					  System.out.println("Price>>"+ rs.getString(5));
					  
				  }
		}
		public static void userInput() throws SQLException {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please Enter Id:");
			int id = scanner.nextInt();
			product(id);
			
		}

	}


