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
import assemblypoint.DBConnector1;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.stage.Stage;





public class signupcontroller implements Initializable {
    
    @FXML private TextField fn,ln,email,pass,cpass,phonenumber,weight,height,mm,dd,yyyy;
    @FXML private Label label1,label2,label3,label4,label5,label6,ww,hh,bb;
    @FXML private CheckBox male,female,rarely,often,always;
    public String firstname,lastname,Email,password,gender,bday;
    public double phonenum;
    public float h,w;
     Connection con=DBConnector1.getConnection();
    

public Boolean numberOrNot(String input){
      try
    {
        Integer.parseInt(input);
    }
    catch(NumberFormatException ex)
    {
        return false;
    }
    return true;
      
      
  }
    public void submithandler(ActionEvent event)throws Exception{
       
       if(fn.getText().isEmpty()){
           label1.setText("required field!");           
         }
     
         if(fn.getText().isEmpty() && numberOrNot(fn.getText())){
           label1.setText("required field!");
           
         }
          if(ln.getText().isEmpty()){
            label2.setText("required field!");
         }
         if(ln.getText().isEmpty() && numberOrNot(ln.getText())){
            label2.setText("required field!");
         }
         if(email.getText().isEmpty() ){
             label3.setText("required field!");
         }
         if(!email.getText().isEmpty() &&  (!email.getText().contains("@outlook.com")
                      || !email.getText().contains("@gmail.com"))){
             label3.setText("incorrect email address!");
         }
         if(!email.getText().isEmpty() &&  ! email.getText().contains("@hotmail.com")){
             label3.setText("incorrect email address");
         }
         if(pass.getText().isEmpty()){
             label4.setText("required field!");
         }
         if(cpass.getText().isEmpty()){
             label5.setText("required field!");
         }
         if(!pass.getText().isEmpty() && !cpass.getText().isEmpty() && !pass.getText().equals(cpass.getText())){
             label4.setText("passwords didn't match!");
             label5.setText("passwords didn't match!");
         }
         if(phonenumber.getText().isEmpty() ||( !phonenumber.getText().isEmpty() && !numberOrNot(phonenumber.getText()))){
             label6.setText("required field!");
         }
         if((dd.getText().isEmpty()&& Integer.parseInt(dd.getText())<0 && Integer.parseInt(dd.getText())>31 )||
                 (mm.getText().isEmpty() && Integer.parseInt(mm.getText())>12 && Integer.parseInt(mm.getText())<0) 
                 || yyyy.getText().isEmpty() && Integer.parseInt(yyyy.getText())>2014 && Integer.parseInt(mm.getText())<1950){
           bb.setText("Required field!");
       }
      
         if(height.getText().isEmpty()){
           hh.setText("Required!");
       } 
         if(weight.getText().isEmpty()){
           ww.setText("Required!");
       }
         
       if(!fn.getText().isEmpty() && !numberOrNot(fn.getText())&& 
               !ln.getText().isEmpty() &&  !numberOrNot(ln.getText()) &&
               ! email.getText().isEmpty()&& (email.getText().contains("@hotmail.com")
                   ||email.getText().contains("@outlook.com")
                        ||email.getText().contains("@gmail.com") )&& !pass.getText().isEmpty() 
             && !cpass.getText().isEmpty() && pass.getText().equals(cpass.getText())
               && !phonenumber.getText().isEmpty() && numberOrNot(phonenumber.getText()) && !weight.getText().isEmpty()
               && !height.getText().isEmpty() &&
               !dd.getText().isEmpty()&& Integer.parseInt(dd.getText())>0 && Integer.parseInt(dd.getText())<31 
               && Integer.parseInt(mm.getText())>0 && Integer.parseInt(mm.getText())<12
              && !mm.getText().isEmpty() && !yyyy.getText().isEmpty() && Integer.parseInt(mm.getText())>1950
               && Integer.parseInt(mm.getText())<2014
               ){
           
           
          
           bday=dd.getText()+"/"+mm.getText()+"/"+yyyy.getText();
           
           firstname= fn.getText();
           lastname=ln.getText();
           Email=email.getText();
           password=pass.getText();
           phonenum=Integer.parseInt(phonenumber.getText() );
           if(male.isSelected()){
               gender="male";
           }
           else{
               gender="female";
           }
           h=Float.parseFloat(height.getText());
           w=Float.parseFloat(weight.getText());
           account Account= new account(firstname,lastname,Email,password,bday,phonenum,gender,h,w);
           
           Statement st;
           ResultSet rs;
           try{
              st=con.createStatement();
              rs=st.executeQuery("INSERT INTO gym VALUES ('"+Account.getFN()+"','"+Account.getLN()+"'"
                      + ",'"+Account.getEmail()+"','"+Account.getPass()+"','"+Account.getBday()+"',"+Account.getHeight()+"','"+Account.getWeight()+"')");
              while(rs.next()){
                   System.out.println("user registered");
          
              FXMLLoader loader = new FXMLLoader(getClass().getResource("view/main.fxml"));
             Parent table= (Parent)loader.load();
             maincontroller main= loader.getController();
           main.getInfoFromSignup(Account);
           
           Scene scene=new Scene(table); 
           scene.setRoot(table);
          Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(scene);
           window.show();
          
              }
               
       }catch(Exception e){
               e.printStackTrace();
           }

    }
    }
   public void reset(ActionEvent event)throws Exception {
         Parent table;
        table = FXMLLoader.load(getClass().getResource("view/signup.fxml"));
           Scene scene=new Scene(table);
           scene.setRoot(table);
           Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(scene);
           window.show();
   }
    
  public void backhandler(ActionEvent event)throws Exception{
      Parent table= FXMLLoader.load(getClass().getResource("view/userlogin.fxml"));
      Scene scene=new Scene(table);
      Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
      window.setScene(scene);
      window.show();
      
  }
     public void exerciseRate(){
       if(rarely.isSelected()){
           often.setSelected(false);
           always.setSelected(false);

       }
       if(often.isSelected()){
           rarely.setSelected(false);
           always.setSelected(false);
       }
       if(always.isSelected()){
           rarely.setSelected(false);
           often.setSelected(false);
       }
   }
    public void FieldHandler(){
       if (!fn.getText().isEmpty()){
           label1.setText("");
       }
       if(!ln.getText().isEmpty()){
           label2.setText("");
       }
       if(!email.getText().isEmpty() ){
           label3.setText("");
       }
       if(!pass.getText().isEmpty()){
           label4.setText("");
       }
       if(!cpass.getText().isEmpty()){
           label5.setText("");
       }
       if(!phonenumber.getText().isEmpty()){
           label6.setText("");
       }
       
   }
     
      public void chooseGender(){
       if(male.isSelected()){
           female.setSelected(false);
       }
       if(female.isSelected()){
           male.setSelected(false);
       }
   }
      
//     Connection con=DbConnect.getConnection();
//       String sql="INSERT INTO 'accounts' VALUES ('"+Account.getFN()+"','"+Account.getLN()+"','"+Account.getEmail()+"','"+Account.getPass()+"','"+Account.getBday()+"','"+Account.getGender()+"','"+Account.getPhone()+"','"+Account.getLN()+"','"+Account.getHeight()+"','"+Account.getWeight()+"')";
//       PreparedStatement preparedStatement=(PreparedStatement)con.prepareStatement(sql);
//       ResultSet resultSet;
//       resultSet = preparedStatement.executeQuery();
//       while(resultSet.next()){
//           System.out.println("user registered");
//           Parent table= FXMLLoader.load(getClass().getResource("FXMLDocument4.fxml"));
//           Scene scene=new Scene(table);
//           scene.setRoot(table);
//           Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
//           window.setScene(scene);
//           window.show();
//           }
       
    
   @Override
  public void initialize(URL url, ResourceBundle rb) {
       
    } 
}
