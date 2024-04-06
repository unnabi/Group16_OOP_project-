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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class EmployeeFeedBackController implements Initializable {

    @FXML
    private TableView<?> feedbackTableView;
    @FXML
    private TableColumn<?, ?> nameTableIndex;
    @FXML
    private TableColumn<?, ?> idTableIndex;
    @FXML
    private TableColumn<?, ?> numberTableIndex;
    @FXML
    private TableColumn<?, ?> feedbackTableIndex;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadFeedbackOnMouseClick(ActionEvent event) {
    }
    
}
