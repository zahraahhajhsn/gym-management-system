/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assemblypoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector1 {
    
   public static Connection con=null;
   public static Connection getConnection(){
  
   try{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   
   }catch(ClassNotFoundException e){
       e.printStackTrace();
   }
   String jdbcurl="jdbc:sqlserver://localhost:1433;databaseName=bank;user=amin;password=z0199;";
   try{
       //con=DriverManager.getConnection(jdbcurl);
       return DriverManager.getConnection(jdbcurl);
   }catch(SQLException e){
   e.printStackTrace();
   }
   System.out.println("connected");
  return con;
  
   }
 //public static void main(String[] args){
       //con = getConnection();
   //}//

}