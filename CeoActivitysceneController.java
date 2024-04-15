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
public class CeoActivitysceneController implements Initializable {

    @FXML
    private TableColumn<?, ?> idonclick;
    @FXML
    private TableColumn<?, ?> soldItemOnClick;
    @FXML
    private TableColumn<?, ?> leftOnClick;
    @FXML
    private TableColumn<?, ?> dateOnClick;
    @FXML
    private TableColumn<?, ?> quantity;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void doneOnclick(ActionEvent event) {
    }

    @FXML
    private void refreshOnClick(ActionEvent event) {
    }

    @FXML
    private void backOnclick(ActionEvent event) {
    }
    
}
