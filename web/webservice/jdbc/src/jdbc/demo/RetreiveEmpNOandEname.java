package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class RetreiveEmpNOandEname {
	public static void main(String[] args) {
		
		Connection connection = null;
		final String username = " sa";
        final String password = "";
        final String jdbcurl =  "jdbc:h2:~/test";
        
        try
        {
        	Class.forName("org.h2.Driver");
        	connection = DriverManager.getConnection(jdbcurl, username, password);
        	System.out.println("Connected..");
        	Statement statement = connection.createStatement();
        	
        	String sql = "Select empno , ename from EMP ";
        	ResultSet rs = statement.executeQuery(sql);
        	while(rs.next()) {
        		System.out.println("Emp No " +rs.getInt("empno"));
        		System.out.println("Emp Name " +rs.getString("ename"));
        	}	
        	}
        	catch(Exception e) {
        		e.printStackTrace();
        	}
        	
	}    
		
	

}
