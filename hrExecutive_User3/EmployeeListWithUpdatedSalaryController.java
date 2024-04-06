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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class EmployeeListWithUpdatedSalaryController implements Initializable {

    @FXML
    private TableView<?> employeeListTableView;
    @FXML
    private TableColumn<?, ?> employeeNameTableColumn;
    @FXML
    private TableColumn<?, ?> employeeIDTableColumn;
    @FXML
    private TableColumn<?, ?> previousSalaryTableColumn;
    @FXML
    private TableColumn<?, ?> incrementPercentTableColumn;
    @FXML
    private TableColumn<?, ?> updatedSalaryTableColumn;
    @FXML
    private RadioButton oldEmployeeRadioButton;
    @FXML
    private RadioButton newEmployeeRadioButton;
    @FXML
    private RadioButton allEmployeeRadioButton;
    @FXML
    private ComboBox<?> departmentComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generateUpdatedEmployeeSalaryButtonOnMouseClick(ActionEvent event) {
    }
    
}
