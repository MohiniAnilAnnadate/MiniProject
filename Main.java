package com.shopping;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws SQLException, NumberFormatException, IOException{
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("....WELCOME TO OUR SHOPPING CART....");
	        System.out.println("Enter your choice:");
	        System.out.println("1. New User regestration");
	        System.out.println("2. User Login");
	        System.out.println("3. Admin Login");

	            int choice = scanner.nextInt();     
	            switch (choice) {
	            case 1:
		            System.out.println("<< welcome to our shopping cart >>");

	            	System.out.println("**OPRN NEW REGESTRATION PAGE**");
	            User_Regestration ur=new User_Regestration();
	            ur.userInput();
	            break;
	            case 2:
		        System.out.println("<< welcome to our shopping cart >>");

	            System.out.println("**OPRN USER LOGIN PAGE**");

	            User_Login ul=new User_Login();
	            ul.userInput();	
	         
	            View_Product vp=new View_Product();
	            System.out.println("*************************************************************************");
	            System.out.println("Here Is the All Product List...");
	            vp.viewProduct();
	            
	         
	            Products p=new Products();
	            System.out.println("**************************************************************************");
	            System.out.println("Select The Product Which You Want...");
	            p.userInput();
	            
	            Buy_Product bp=new Buy_Product();
	            System.out.println("You Want Some buy Product");
            	bp.userInput();
            	
            	System.out.println("Quantity with Cart");
            	Quantity q=new Quantity();
            	q.userInput();
            	
	            
                break;
	          
	            case 3:
		            System.out.println("<< welcome to our shopping cart >>");
		            System.out.println("**OPRN ADMIN PAGE**");
	            	Admin_Login al=new Admin_Login();
	            	al.userInput();
	            	
	            }
	            
	            
	    }
	}

	


