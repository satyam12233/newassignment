package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeptName {
	public static void main(String[] args) {
		
		Connection connection = null;
		final String username = " sa";
        final String password = "";
        final String jdbcurl =  "jdbc:h2:~/test";
        String selectsql = "";
        
        	try {
        		
        		Class.forName("org.h2.Driver");
            	
            	connection = DriverManager.getConnection(jdbcurl, username, password);
            	System.out.println("Connected..");
            	Statement statement = connection.createStatement();
            	
               
//            	 String sql = 	"create table dept"+
//            			 "(deptno number(2,0),"+        			
//            			 "dname varchar2(14),"+
//            			 	"loc varchar2(13),"+
//            			 	"constraint pk_dept primary key (deptno))";
//            	 			statement.executeUpdate(sql);
//            	 			System.out.println("done..");
            	 			
            	 		selectsql = "select * from dept";
            	 	  ResultSet rs = statement.executeQuery(selectsql);
            	 	  while(rs.next()) {
            	 		  
            	 		  System.out.println("Deptartment No "+rs.getInt("deptno"));
            	 		  System.out.println("Deptartment Name "+rs.getString("dname"));
            	 		  System.out.println("Deptartment Location "+rs.getString("loc"));
            	 	  }
        	}
            	 	  catch(Exception e) {
            	 		  e.printStackTrace();
            	 	  }

            	 				
            	 			
        	
        }
		
	}
	

