/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class DeliveryController implements Initializable {

    @FXML
    private TableView<?> tableViewOnClick;
    @FXML
    private TableColumn<?, ?> productIDTableOnClick;
    @FXML
    private TableColumn<?, ?> ProductNameOnTableClick;
    @FXML
    private TableColumn<?, ?> quantityTableOnClick;
    @FXML
    private TextField productIdOnClick;
    @FXML
    private TextField productNameOnClick;
    @FXML
    private TextField quantityOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void checkDeliveryButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) {
    }
    
}
