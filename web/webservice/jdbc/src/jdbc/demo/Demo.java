package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
 
public class Demo {
    public static void main(String ar[]) {
 
        Connection connection = null;
        final String username = " sa";
        final String password = "";
        final String jdbcurl =  "jdbc:h2:~/test";
 
        // String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
        // String user = "sa";
        // String pass = "";
 
        try {
 
            Class.forName("org.h2.Driver"); ///
 
            connection = DriverManager.getConnection(jdbcurl,username,password);///authentication
 
            System.out.println("connected...");
 
        } catch (Exception e) {
            e.printStackTrace();
 
        }
 
    }
 
}