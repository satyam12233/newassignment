package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
public class InsertDemo {
	public static void main(String[] args) {
		
		Connection connection = null;
		final String username = " sa";
        final String password = "";
        final String jdbcurl =  "jdbc:h2:~/test";	
		try
		{
			Class.forName( "org.h2.Driver");
			connection = DriverManager.getConnection(jdbcurl, username, password);
			Statement statement = connection.createStatement();
			  
			  String sql = "CREATE TABLE customer " + "(id INTEGER not NULL, " +
		              " age VARCHAR(255), " + " address VARCHAR(255), " + " salary INTEGER, " +
		              " PRIMARY KEY ( id ))";
		             
			  statement.executeUpdate(sql);
			  
			 String insert = "INSERT INTO CUSTOMER VALUES (3,'32','Ahmedabad',2000);()";
			  statement.executeUpdate(insert);
			
			System.out.println("Done...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
