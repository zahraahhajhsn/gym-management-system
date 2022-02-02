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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class healthcontroller implements Initializable {
    
      @FXML private Label bmilabel;
    int height,weight;
    
    public void backhandler(ActionEvent event)throws Exception{
             Parent table;
        table = FXMLLoader.load(getClass().getResource("mainfxml.fxml"));
           Scene scene=new Scene(table);
           scene.setRoot(table);
           Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(scene);
           window.show();
     
    }
    
    public void bmicalculator(int h,int w){
                  height=h;
                  weight=w;
        
    }
    public void bmihandler(ActionEvent event)throws Exception{
        float bmi;
        bmi=weight/(height*height);
        bmilabel.setText(String.valueOf(bmi));
        
    }
    
    
   @Override
  public void initialize(URL url, ResourceBundle rb) {
       
    }  
}
