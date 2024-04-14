/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package accountant_User4;

import hrExecutive_User3.Employee;
import hrExecutive_User3.HRExecutive;
import hrExecutive_User3.Incrementation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class UpdateSalaryController implements Initializable {

    @FXML
    private ComboBox<Integer> employeeIDComboBox;
    @FXML
    private TextField employeeNameTextField;
    
    @FXML
    private TextField salaryIncrementTextField;
    @FXML
    private TextField newSalaryTextField;
    @FXML
    private TextField deptTextField;
    
    Alert alert;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList <Incrementation> employeeID = FXCollections.observableList(HRExecutive.loadSalaryIncrementDataFromList("SalaryIncrementObj.bin"));
        for (Incrementation i : employeeID){
            
            employeeIDComboBox.getItems().addAll(i.getEmployeeID());
            
        }
        // TODO
    }    

    @FXML
    private void updateNewSalaryOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void upddatedListButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void employeeIDSelectOnMouseClick(ActionEvent event) {
        
        
        ObservableList <Incrementation> employee = FXCollections.observableList(HRExecutive.loadSalaryIncrementDataFromList("SalaryIncrementObj.bin"));
        ObservableList <Salary> salary = FXCollections.observableList(Accountant.loadSalaryDeclarationDataFromFile("EmployeeSalaryData.bin"));
        
        
        for(Incrementation in : employee){
            
            for (Salary s : salary){
                
                if(in.getEmployeeID()==employeeIDComboBox.getValue()){
                    employeeNameTextField.setText(in.getEmployeeName());
                    
                    salaryIncrementTextField.setText(String.valueOf(in.getPercentOfIncrement()));
                    
                    deptTextField.setText(in.getEmployeeDept());
                    
                    

                    newSalaryTextField.setText(String.valueOf(calculateNewSalary(s.getSalary(),in.getPercentOfIncrement())));
            
            
                }    

            
            }
            
        }
        
    }
    private float calculateNewSalary(int oldSalary, int increment){
        
        float newSalary = (oldSalary * (increment/100));
        
        return newSalary;
    
    
    }
    
    
}
