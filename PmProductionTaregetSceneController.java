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

/**
 * FXML Controller class
 *
 * @author NUSRAT JAHAN
 */
public class PmProductionTaregetSceneController implements Initializable {

    @FXML
    private TableColumn<?, ?> productNameOnClick;
    @FXML
    private TableColumn<?, ?> quantityOnClick;
    @FXML
    private TableColumn<?, ?> deadlineOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backOnClick(ActionEvent event) {
    }

    @FXML
    private void refreshOnClick(ActionEvent event) {
    }
    
}
