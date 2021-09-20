//Modify the above program to display all the rows where sal is greater than 1000 and less than 2000. Display the columns ename, job, sal and comm.

package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetreiveByEmp {
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
        	
        	String sql = "Select ename,job,sal,comm from EMP where sal>1000 and sal<2000";
        	ResultSet rs = statement.executeQuery(sql);
        	while(rs.next()) {
        		System.out.println("EmployeeName- "+rs.getString("ename"));
        		System.out.println("Job -\t"+rs.getString("job"));
        		System.out.println("Salary-\t "+rs.getInt("sal"));
        		System.out.println("Comm-\t"+rs.getInt("comm"));
        	}
        }
        			catch(Exception e) {
        				e.printStackTrace();
        }
	}

}
