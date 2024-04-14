/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountant_User4;

import hrExecutive_User3.HRExecutive;
import hrExecutive_User3.Incrementation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Dell
 */
public class UpdateSalary {
    
    private int employeeID, incrementedPercentage,newSalary,oldSalary;
    private String employeeName,dept;
    
    ObservableList <Incrementation> employee = FXCollections.observableList(HRExecutive.loadSalaryIncrementDataFromList("SalaryIncrementObj.bin"));
    ObservableList <Salary> salary = FXCollections.observableList(Accountant.loadSalaryDeclarationDataFromFile("SalaryData.bin"));

    public UpdateSalary() {
    }

    public UpdateSalary(int employeeID, int incrementedPercentage, int newSalary, String employeeName, String dept) {
        
        for(Incrementation i : employee){
            for (Salary s : salary){
                if(i.getEmployeeID() == s.getId()){
                    
                    this.employeeID = employeeID;
                    this.incrementedPercentage = incrementedPercentage;
                    this.newSalary = newSalary;
                    this.employeeName = employeeName;
                    this.dept = dept;
                
                
                }
            }
             
        
        }
        this.employeeID = employeeID;
        this.incrementedPercentage = incrementedPercentage;
        this.newSalary = newSalary;
        this.employeeName = employeeName;
        this.dept = dept;
    }

//    public UpdateSalary(int employeeID, int incrementedPercentage, int newSalary, int oldSalary, String employeeName, String dept) {
//        
//        for(Incrementation i : employee){
//            for (Salary s : salary){
//                if(i.getEmployeeID() == s.getId()){
//                    
//                    this.employeeID = i.getEmployeeID();
//                    this.incrementedPercentage = i.getPercentOfIncrement();
//                    this.newSalary = newSalary;
//                    this.employeeName = i.getEmployeeName();
//                    this.dept = i.getEmployeeDept();
//                    this.oldSalary = s.getSalary();
//                
//                
//                }
//            }
//        }
//    }
}
