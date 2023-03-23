package com.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Buy_Product {
	public static void BuyProduct(int ProductId) throws SQLException {
		 Connection cnn;
		 cnn = AllConnection.getConnection();
		 String sql = "select * from products where ProductId=?";
		 PreparedStatement stmt = cnn.prepareStatement(sql);
		 stmt.setInt(1, ProductId);
		 ResultSet rs = stmt.executeQuery();
		      if (rs.next()) {
		                 // Print the product information
		                 String productName = rs.getString("ProductName");
		                 double productPrice = rs.getInt("price");
		                 int availableQuantity = rs.getInt("AvailableQuantity");
		                 System.out.println("Product Name: " + productName);
		                 System.out.println("Price: $" + productPrice);
		                 System.out.println("Available Quantity: " + availableQuantity);
		             } else {
		                 // Handle the case where the product ID is invalid
		                 System.out.println("Invalid product ID.");
		             }

		             // Close the database connection and resources
		             rs.close();
		             stmt.close();
		             cnn.close();
		      
		     }
	public static void userInput() throws SQLException{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product ID: ");
        int productId = scanner.nextInt();
      BuyProduct(productId);
	}
		 }
	

