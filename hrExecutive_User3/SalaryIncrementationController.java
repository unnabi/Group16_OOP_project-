/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hrExecutive_User3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class SalaryIncrementationController implements Initializable {

    @FXML
    private TextField employeeNameTextField;
    @FXML
    private TextField employeeIDTextField;
    @FXML
    private ComboBox<?> deptComboBox;
    @FXML
    private ComboBox<?> incrementPercentComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmIncrementationButtonOnMouseCkick(ActionEvent event) {
    }

    @FXML
    private void notifyAccountantButtonOnMouseCkick(ActionEvent event) {
    }
    
}
