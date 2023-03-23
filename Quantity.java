package com.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Quantity {

	    public static void userInput() throws SQLException {
	        	 Connection cnn;
	    		 cnn = AllConnection.getConnection();
	    		 String sql = "select * from products";
	    	
				 PreparedStatement pstmt = cnn.prepareStatement(sql);			  
				
				 // Execute select statement
	ResultSet rs = pstmt.executeQuery();
	            Scanner input = new Scanner(System.in);

	            System.out.print("Enter the product id to buy product>> ");
	            int productId = input.nextInt();

	            System.out.print("Enter the quantity>> ");
	            int quantity = input.nextInt();

	            System.out.print("Do you want to view cart (Yes/No)>> ");
	            String viewCart = input.next();

	            if (viewCart.equalsIgnoreCase("yes")) {
	                 rs = pstmt.executeQuery("SELECT * FROM products");
	                System.out.println("Your shopping cart contains:");

	                while (rs.next()) {
	                    int id = rs.getInt("ProductId");
	                    String name = rs.getString("ProductName");
	                    int price = rs.getInt("price");
	                    int availableQuantity = rs.getInt("AvailableQuantity");
                        //CALCULATE TOTAL BILL OF USER
	                    if (id == productId) {
	                        if (availableQuantity >= quantity) {
	                            System.out.println(name +"\n"+"Product Quantity"+" "+ quantity);
	                            System.out.println("Total Calculated Bill Of Your Product..."+ " " + (price * quantity));
	                            int newQuantity = availableQuantity - quantity;
	                            pstmt.executeUpdate("UPDATE products SET AvailableQuantity = " + newQuantity + " WHERE ProductId = " + productId);
	               System.out.println("Buy product successfully....");
	                        } else {
	                            System.out.println("Sorry, the quantity you requested is not available.");
	                        }
	                        break;
	                    }
	                }
	            } else {
	                System.out.println("Thank you for shopping with us.");
	            }

	            cnn.close();
	      
	    }
	}


