/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ApplicationProductController implements Initializable {
    
    Alert unfilled= new Alert(Alert.AlertType.WARNING,"Do fill everythings");
    Alert Success = new Alert(Alert.AlertType.INFORMATION, "Succesfully event");
    Alert InvalidInput = new Alert(Alert.AlertType.WARNING, "Not a number");

    @FXML
    private TextField productNameOnClick;
    @FXML
    private TextField productIdOnClick;
    @FXML
    private TextArea textAreaOnClick;
    @FXML
    private ComboBox<String> instractionClickOnCB;
    private Application value;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        instractionClickOnCB.getItems().add("How to use the product and it's recyling of Material");
        
    }    

    @FXML
    private void createApplicationButtonOnClick(ActionEvent event) {
        
         textAreaOnClick.setText(this.value.toString());
    }

    @FXML
    private void gobackButtonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("SalesOfficerDashboard_1.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) {
       String ProductId=productIdOnClick.getText();
        if (ProductId.isEmpty()){
            unfilled.show();
        return;
        }
       String Instruction =  instractionClickOnCB.getValue();
       if (Instruction.isEmpty()){
            unfilled.show();
           return;
       }
       String ProductName = productNameOnClick.getText(); 
        this.value = new Application(ProductId, ProductName,  Instruction);
       
       Success.show();
       
       
        
        
        
        
        
        
        
    }
    
}
