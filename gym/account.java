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
public class account {
        private String fn;
        private String ln;
        private String bday;
                private String email;
        private String pass;
                private float height;
                private float weight;
private double phone;
private String gender;


     
    public account (){}
    
    public account(String fn,String ln,String email,String pass,String bday,double phone,String gender,float height,float weight){
        this.fn=fn;
        this.ln=ln;
        this.pass=pass;
        this.email=email;
        this.bday=bday;
        this.weight=weight;
        this.height=height;
        this.phone=phone;
        this.gender=gender;
       
    }
    public String getGender(){
        return gender;
    }
      public String getLN(){
        return ln;
    }
    public String getFN(){
        return fn;
    }
    public String getBday(){
        return bday;
    }
     public void setBday(String bday){
        this.bday=bday;
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
    public void setPass(String pass){
        this.pass=pass;
    }
    public void setPhone(double phone){
        this.phone=phone;
    }
    public void setWeight(float weight){
        this.weight=weight;
    }
    public void setHeight(float height){
        this.height=height;
    }
    public String getEmail(){
        return email;
    }
    public double getPhone(){
        return phone;
    }
    public float getWeight(){
        return weight;
    }
    public float getHeight(){
        return height;
    }
    public String getPass(){
        return pass;
    }
}
