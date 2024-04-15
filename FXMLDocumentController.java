/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ceramicindustry_oopproject_group16;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;

/**
 * FXML Controller class
 *
 * @author SHEHAB NABI
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField TFfirstname;
    @FXML
    private TextField TFlastname;
    @FXML
    private TextField TFemail;
    @FXML
    private TextField TFaddress;
    @FXML
    private TextField TFnumber;
    @FXML
    private TextField TFcompany;
    @FXML
    private TextField TFsign;
    @FXML
    private Button registerbutton;
    @FXML
    private Label labelResult;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void RegisterOnMouseClicked(MouseDragEvent event) {
    }

    @FXML
    private void RegisterOnMouseClicked(ActionEvent event) {
    }
    
}
