
package project;

import java.sql.*;
public class ConnectionProvider {
private static Connection con;
     public static Connection getconnection(){
     try{
         if(con==null){
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Office" , "khan" , "Bhopal@06");
         }
     }
      catch(Exception e){
          e.printStackTrace();
}
     return con;
     }
}
