package com.shopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AllConnection {
    
		public static Connection getConnection() throws SQLException {
			  Connection cnn=null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				cnn=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_shopping","root","Nilesh@123");

				
	
				
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return cnn;
			
}
}