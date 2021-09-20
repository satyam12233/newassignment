//1Write a java program that connects to h2 database, queries the inbuilt table “emp” and displays the first two columns (empno using column index and ename using column name )
// of all the rows.

package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcAssignment {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		final String username = " sa";
        final String password = "";
        final String jdbcurl =  "jdbc:h2:~/test";
        String selectsql = "";
				
        try {
        	
        	Class.forName("org.h2.Driver");
        	
        	connection = DriverManager.getConnection(jdbcurl, username, password);
        	
        	Statement statement = connection.createStatement();
        	
              	
//        	String sql = "CREATE TABLE emp"+
//        			"(empno number(4,0),"+
//        			"ename varchar2(10),"+
//        			"job varchar2(9),"+
//        			"mgr number(4,0),"+
//        			"hiredate date,"+ 
//        			"sal number(7,2),"+
//        			"comm number(7,2),"+
//        			"deptno number(2,0),"+	 
//        			"constraint pk_emp primary key (empno),"+ 
//        			"constraint fk_deptno foreign key (deptno) references dept (deptno))";
      // String insert = "INSERT INTO emp VALUES (116,'Ashu','TL',1,'2019-06-26',1200,1,1)";
		//	  statement.executeUpdate(insert);
			//  System.out.println("Done...");
      }
        catch(Exception e) {
        	e.printStackTrace();         
        	
        }
       
        

	}
}

