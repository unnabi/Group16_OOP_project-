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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class CostMaterialController implements Initializable {

    @FXML
    private ComboBox<?> productNameOnClick;
    @FXML
    private TextField priceOnClick;
    @FXML
    private TextField vatOnClick;
    @FXML
    private ComboBox<?> quantityOnClick;
    @FXML
    private TableView<?> tableViewOnClick;
    @FXML
    private TableColumn<?, ?> productNameTableOnClick;
    @FXML
    private TableColumn<?, ?> priceTableOnClick;
    @FXML
    private TableColumn<?, ?> quantityTableOnClick;
    @FXML
    private TableColumn<?, ?> vatTableOnClick;
    @FXML
    private TableColumn<?, ?> totalCostTableOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void selectProductButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void addbuttonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewUpdateTableButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }
    
}
