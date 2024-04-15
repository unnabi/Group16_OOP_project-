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
 * @author NUSRAT JAHAN
 */
public class CeoTargetSetsceneController implements Initializable {

    @FXML
    private TableColumn<?, ?> productnameonclick;
    @FXML
    private TableColumn<?, ?> quantityonclick;
    @FXML
    private TableColumn<?, ?> deadlineonclick;
    @FXML
    private TextField productNameOnClick;
    @FXML
    private TextField quantityOnClick;
    @FXML
    private TableView<?> textAreaOnClick;
    @FXML
    private TableColumn<?, ?> targetTableOnClick;
    @FXML
    private TextField target;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backonClick(ActionEvent event) {
    }

    @FXML
    private void sentOnClick(ActionEvent event) {
        
    }
    
}
