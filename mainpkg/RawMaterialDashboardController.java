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
public class RawMaterialDashboardController implements Initializable {

    @FXML
    private ComboBox<String> comboBoxOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       comboBoxOnClick.getItems().addAll("MaterialOrder","DeliveryProduct","Returnproduct",
                "MaterialCost","AvailableProduct","MaterialInstruction","Catalog","UpdateLocation");
    }    

    @FXML
    private void nextPageButtonOnClick(ActionEvent event) throws IOException {
        String a=comboBoxOnClick.getValue().toString();
        Parent sceneA = null;
        
        if(a=="MaterialOrder"){
            sceneA=FXMLLoader.load(getClass().getResource("orderProduct.fxml"));   
            
        }
        else if(a=="DeliveryProduct"){
             sceneA=FXMLLoader.load(getClass().getResource("delivery.fxml"));   
        }
        
         else if(a=="Returnproduct"){
             sceneA=FXMLLoader.load(getClass().getResource("ReturnProduct.fxml"));   
        }
         else if(a=="MaterialCost"){
             sceneA=FXMLLoader.load(getClass().getResource("costMaterial.fxml"));   
        }
        
        else if(a=="AvailableProduct"){
             sceneA=FXMLLoader.load(getClass().getResource("Availability.fxml"));
             
        }
        else if(a=="MaterialInstruction"){
              sceneA=FXMLLoader.load(getClass().getResource("InstructionMaterial.fxml"));
        }
        
       
        else if(a=="Catalog"){
              sceneA=FXMLLoader.load(getClass().getResource("MaterialCatalog.fxml"));
        }
        
        else if(a=="UpdateLocation"){
              sceneA=FXMLLoader.load(getClass().getResource("trackLocation.fxml"));
        }
        
        
        Scene sceneB = new Scene(sceneA);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();
    }
    
}
