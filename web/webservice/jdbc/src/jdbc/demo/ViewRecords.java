package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ViewRecords {
	public static void main(String[] args) {
		
		Connection connection = null;
		final String username = " sa";
        final String password = "";
        final String jdbcurl =  "jdbc:h2:~/test";
        String selectsql = "";
        
        try
        {
        	Class.forName("org.h2.Driver");
        	connection = DriverManager.getConnection(jdbcurl, username, password);
        	
        	Statement statement = connection.createStatement();
        	
        	
        	 // retreive data from  table customer
        	
        	 selectsql = "select * from CUSTOMER ";
        	 ResultSet rs = statement.executeQuery(selectsql);
        	
        	 while(rs.next()) {
        		 
        		 System.out.print("ID is: " + rs.getInt("id"));
                 System.out.print("age is: " + rs.getString("age"));
                 System.out.print("addres: is " + rs.getString("address"));
                 System.out.print("salary is : " + rs.getString("salary"));
        	 }
        	 
        }
        	 catch(Exception e) {
        		 e.printStackTrace();
        	 }
        	
        }
	}


