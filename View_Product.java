package com.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View_Product {	
		public static void viewProduct() throws SQLException {
				 Connection cnn;
				 cnn = AllConnection.getConnection();
				 String sql = "select * from products";
				 PreparedStatement pstmt = cnn.prepareStatement(sql);			  
				
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
			System.out.println("All Product List->");
			viewProduct();
			}
}
