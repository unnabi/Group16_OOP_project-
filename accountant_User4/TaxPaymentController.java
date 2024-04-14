/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package accountant_User4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class TaxPaymentController implements Initializable {

    @FXML
    private TextField profitAmountTextField;
    @FXML
    private TextField taxOercentTextField;
    @FXML
    private TextField totalTaxTextField;
    @FXML
    private RadioButton bkashRadioButton;
    @FXML
    private RadioButton rocketRadioButton;
    @FXML
    private RadioButton nagadRadioButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calculateTaxButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void payTaxButtonOnMouseClick(ActionEvent event) {
    }
    
}
