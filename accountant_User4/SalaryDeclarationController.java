/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package accountant_User4;

import hrExecutive_User3.Employee;
import hrExecutive_User3.HRExecutive;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
public class SalaryDeclarationController implements Initializable {

    @FXML
    private ComboBox<Integer> empIDComboBox;
    @FXML
    private TextField empNameTextField;
    @FXML
    private TextField contactNumTextField;
    @FXML
    private TextField recruitedDeptTextField;
    @FXML
    private TextField salaryTextField;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ObservableList <Employee> employee = FXCollections.observableList(HRExecutive.loadEmployeeList("EmployeeObject.bin"));
        
        for (Employee e : employee){
            
            empIDComboBox.getItems().addAll(e.getEmployeeID());
            
        }
        
    }    

    @FXML
    private void declareSalaryButtonOnMouseClick(ActionEvent event) {
        
    }
    @FXML
    private void employeeIDComboBoxOnMouseClick(ActionEvent event) {
        ObservableList <Employee> employee = FXCollections.observableList(HRExecutive.loadEmployeeList("EmployeeObject.bin"));
        for (Employee em : employee){
            
            if (em.getEmployeeID() == empIDComboBox.getValue()){
                empNameTextField.setText(em.getEmployeeName());
                
                contactNumTextField.setText(String.valueOf(em.getEmployeeContactNumber()));
                
                recruitedDeptTextField.setText(em.getAssignedDept());
            }
        
        }
                
    }
    
    
}
