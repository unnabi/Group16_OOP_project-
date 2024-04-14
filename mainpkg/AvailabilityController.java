/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class AvailabilityController implements Initializable {

    @FXML
    private TextField quantityOnClick;
    @FXML
    private TextField materialIdOnClick;
    @FXML
    private ComboBox<String> materialNameOnClick;
    @FXML
    private TextArea textAreaOnClick;
    @FXML
    private ComboBox<String> comboBoxOnClick;
     private ArrayList<Availability>avlty= new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        materialNameOnClick.getItems().addAll("clay","Silica","Feldspar");
        // TODO
    }    

    @FXML
    private void checkAvailabilityButtonOnClick(ActionEvent event) {
        String selectedName=  materialNameOnClick.getValue();
        for (Availability st :avlty){
            if (st.getMaterialName()==selectedName){
               textAreaOnClick.setText("MaterialName: " + st.getMaterialName() + "\nMaterialID:" + st.getMaterialId() + "\nQuantity:" + st. getQuantity());
            break;
              
          }
        
  }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("RawMaterialDashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) {
        String MaterialName =materialNameOnClick.getValue();
        String MaterialId= materialIdOnClick.getText();
       String Quantity =quantityOnClick.getText();
        
        Availability prodt= new Availability(MaterialName, MaterialId,Quantity);
        
       comboBoxOnClick.getItems().add(MaterialName);
        
       avlty.add(prodt);
    }
    
}
