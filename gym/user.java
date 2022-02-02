/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assemblypoint;

/**
 *
 * @author nur kn3n
 */
public class user extends account{
    
      private String fn;
    private String ln;
    private String bday;
    public String email;
    public String pass;
    private double phone;
    private String gender;
    private float w;
    private float h;
    
    
    
    
    public user(){
        
    }
     
    public user(String fn,String ln,String email,String pass,String bday,
            double phone,String gender,float h,float w){
        this.fn=fn;
        this.ln=ln;
        this.bday=bday;
        this.email=email;
        this.pass=pass;
       
        this.phone=phone;
        this.gender=gender;
        this.h=h;
        this.w=w;
    
    
}
    
   public void setLN(String ln){
        this.ln=ln;
    }
    public void setFN(String fn){
        this.fn=fn;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPass(String pass ){
        this.pass=pass;
    }
    public void setBday(String bday){
        this.bday=bday;
    }
     
    public void setPhone(double phone){
        this.phone=phone;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setWeight(float w){
        this.w=w;
    }
    public void setHeight(float h){
        this.h=h;
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
    public double getPhone(){
        return phone;
    }
    public String getGender(){
        return gender;
    }
    public float getWeight(){
        return w;
    }
    public float getHeight(){
        return h;
    }
}