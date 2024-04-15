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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author NUSRAT JAHAN
 */
public class PmBillSceneController implements Initializable {

    @FXML
    private TextField productNameOnClick;
    @FXML
    private TextField quantityOnClick;
    @FXML
    private TextField billCoceOnClick;
    @FXML
    private TextField priceOnClick;
    @FXML
    private DatePicker dateOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitOnClick(ActionEvent event) {
    }
    
}
