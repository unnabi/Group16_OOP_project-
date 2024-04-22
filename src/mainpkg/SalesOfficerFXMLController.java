/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class SalesOfficerFXMLController implements Initializable {

    @FXML
    private ComboBox<String> comboBoxOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    comboBoxOnClick.getItems().addAll("ForeCastSale","Achieve Target","Product Application",
                "Discount Policy","Sales Report","Performance Rating","Client FeedBack","Invoice");
    }    

    @FXML
    private void sceneSwitchPageButtonOnClick(ActionEvent event) throws IOException {
         String a=comboBoxOnClick.getValue().toString();
        Parent sceneA = null;
        if(a=="ForeCastSale"){
            sceneA=FXMLLoader.load(getClass().getResource("forecastSale.fxml"));   
            
        }
        else if(a=="Achieve Target"){
             sceneA=FXMLLoader.load(getClass().getResource("achieveSalesTarget.fxml"));   
        }
        
         else if(a=="Product Application"){
             sceneA=FXMLLoader.load(getClass().getResource("applicationProduct.fxml"));   
        }
       
          else if(a=="Discount Policy"){
             sceneA=FXMLLoader.load(getClass().getResource("discount.fxml"));   
        }
        else if(a=="Sales Report"){
             sceneA=FXMLLoader.load(getClass().getResource("salesReport.fxml"));   
        }
        else if(a=="Performance Rating"){
             sceneA=FXMLLoader.load(getClass().getResource("ratingProductPerformance.fxml"));   
        }
        else if(a=="Client FeedBack"){
             sceneA=FXMLLoader.load(getClass().getResource("feedbackClient.fxml"));   
        }
         else if(a=="Invoice"){
             sceneA=FXMLLoader.load(getClass().getResource("invoice.fxml"));   
        } 
        Scene sceneB = new Scene(sceneA);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SalesOfficerDashboard_1.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
    
}
