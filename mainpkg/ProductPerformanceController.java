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
public class ProductPerformanceController implements Initializable {

    @FXML
    private TextField productRatingOnClick;
    @FXML
    private ComboBox<String> comboBoxOnClick;
    @FXML
    private TextArea textAreaOnClick;
    @FXML
    private TextField productIdOnClick;
    private TextField productNameOnClick;
    private ArrayList<PerformaneRating>perrat=new ArrayList<>();
    @FXML
    private ComboBox<String> productNameComboBoxOnClock;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         productNameComboBoxOnClock.getItems().addAll("Tiles","Bone China","Glass","Porcelain");
        // TODO
    }    

    @FXML
    private void generateRatingButtonOnClick(ActionEvent event) {
        //String ProductName = productNameOnClick.getText();
        String ProductId= productIdOnClick.getText();
        String ProductName = productNameComboBoxOnClock.getValue();
       String ProductRating =productRatingOnClick.getText();
        
        PerformaneRating newstudent= new PerformaneRating (ProductId, ProductName,ProductRating);
        
       comboBoxOnClick.getItems().add(ProductId);
        
       perrat.add(newstudent);
        
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

    @FXML
    private void showRatingButtonOnClick(ActionEvent event) {
         
        String selectedId= comboBoxOnClick.getValue();
        for (PerformaneRating rat :perrat){
            if (rat.getProductId()==selectedId){
                textAreaOnClick.setText("Id: " +rat.getProductId() + "\nname:" + rat. getProductName() + "\nRating:" + rat.getProductRating());
            break;
              
            }
            
            
        }
    }
    
}
