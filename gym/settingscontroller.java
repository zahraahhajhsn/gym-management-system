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
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class settingscontroller implements Initializable {
    
     public void backhandler(ActionEvent event)throws Exception{
             Parent table;
        table = FXMLLoader.load(getClass().getResource("mainfxml.fxml"));
           Scene scene=new Scene(table);
           scene.setRoot(table);
           Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(scene);
           window.show();
     
    }
     
       public void logouthandler(ActionEvent event)throws Exception{
             Parent table;
        table = FXMLLoader.load(getClass().getResource("userlogin.fxml"));
           Scene scene=new Scene(table);
           scene.setRoot(table);
           Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(scene);
           window.show();
     
    }
       public void personalinformation(ActionEvent event)throws Exception{
                 Parent table;
        table = FXMLLoader.load(getClass().getResource("personalinformation.fxml"));
           Scene scene=new Scene(table);
           scene.setRoot(table);
           Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(scene);
           window.show();
       }
        public void managepassword(ActionEvent event)throws Exception{
                 Parent table;
        table = FXMLLoader.load(getClass().getResource("personalinformation.fxml"));
           Scene scene=new Scene(table);
           scene.setRoot(table);
           Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(scene);
           window.show();
       }
   @Override
  public void initialize(URL url, ResourceBundle rb) {
       
    }  
}
