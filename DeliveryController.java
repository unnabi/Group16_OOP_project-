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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class DeliveryController implements Initializable {

    @FXML
    private TableView<Delivery> tableViewOnClick;
    @FXML
    private TableColumn<Delivery, String> productIDTableOnClick;
    @FXML
    private TableColumn<Delivery, String> ProductNameOnTableClick;
    @FXML
    private TableColumn<Delivery, String> quantityTableOnClick;
    @FXML
    private TextField productIdOnClick;
    @FXML
    private TextField productNameOnClick;
    @FXML
    private TextField quantityOnClick;
     private ArrayList<Delivery>dlry=new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void checkDeliveryButtonOnClick(ActionEvent event) {
        for(Delivery c:dlry){
          tableViewOnClick.getItems().add(
                new Delivery(c.getProductId(),c.getProductName(),
                        c.getQuantity())
        );  
    }
    }
    @FXML
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("RawMaterialDashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) throws IOException {
        Delivery item =new Delivery(Integer.parseInt(productIdOnClick.getText()), productNameOnClick.getText(),
                Integer.parseInt( quantityOnClick.getText()));
        
        dlry.add(item);
        
    
        
        
                
            
            
        
        
       productIDTableOnClick.setCellValueFactory(new PropertyValueFactory<>("ProductId"));
        ProductNameOnTableClick.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
       quantityTableOnClick.setCellValueFactory(new PropertyValueFactory<>("quantity"));
       
        
        
    
          
        
    }   
}
