/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assemblypoint;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nur kn3n
 */
public class admin extends account{
    
    private String email;
    private String pass;
    private String ln;
    private String fn;
    private String bday;
    private float w;
    private float h;
    
    
    public admin(String fn,String ln,String bday,String email,String pass,float h,float w){
        this.fn=fn;
        this.ln=ln;
        this.bday=bday;
        this.email=email;
        this.pass=pass;
        this.h=h;
        this.w=w;
    }
    
 
    public String getLN(){
        return ln;
    }
    public String getFN(){
        return fn;
    }
    public String getEmail(){
        return email;
    }
    public String getPass(){
        return pass;
    }
    public String getBday(){
        return bday;
    }
  public void adduser(user user){
      try{
          
           Statement st=null;
           ResultSet rs=null;
          Connection con=DBConnector1.getConnection();
          st=con.createStatement();
           rs=st.executeQuery("INSERT INTO 'user' VALUES ('"+user.getFN()+"','"+user.getLN()+"'"
                      + ",'"+user.getEmail()+"','"+user.getPass()+"','"+user.getBday()+"','"+user.getGender()+"'"
                              + ",'"+user.getPhone()+"','"+user.getLN()+"'"
                      + ",'"+user.getHeight()+"','"+user.getWeight()+"')");
            while(rs.next()){
                   System.out.println("user registered");
            }
          
      }catch(SQLException e){
          e.printStackTrace();
      }
  }
    
}
