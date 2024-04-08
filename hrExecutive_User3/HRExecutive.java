/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrExecutive_User3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import mainpkg.User;

/**
 *
 * @author Dell
 */
public class HRExecutive extends User implements Serializable {
    
    public HRExecutive(String fullName, String userName, String phoneNumber, String password, LocalDate Dob) {
        super(fullName, userName, phoneNumber, password, Dob);
    }
    
    public static ArrayList<Employee> loadEmployeeList(String employeeFile){
        ArrayList<Employee> employeeList = new ArrayList();
        
        try{
            FileInputStream fis = new FileInputStream(employeeFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                try{
                    Employee employees = (Employee) ois.readObject();
                    employeeList.add(employees);
                
                }catch(Exception e){
                    break;
                }
            
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    return employeeList;
    
    }
    
    public static void addEmployeetoList(Employee employee, String employeeFile){
        
        ArrayList<Employee> fullEmployeeList = loadEmployeeList(employeeFile);
        fullEmployeeList.add(employee);
        
        try{
            
            FileOutputStream fos = new FileOutputStream(employeeFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(Employee emp : fullEmployeeList){
                oos.writeObject(emp);
            }
            oos.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
    
    public static ArrayList<Intern> loadInternList(String internFile){
        ArrayList<Intern> internList = new ArrayList();
        
        try{
            FileInputStream fis = new FileInputStream(internFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                try{
                    Intern interns = (Intern) ois.readObject();
                    internList.add(interns);
                
                }catch(Exception e){
                    break;
                }
            
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    return internList;
    
    }
    
    public static void addInterntoList(Intern intern, String employeeFile){
        
        ArrayList<Intern> fullInternList = loadInternList(employeeFile);
        fullInternList.add(intern);
        
        try{
            
            FileOutputStream fos = new FileOutputStream(employeeFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(Intern internss : fullInternList){
                oos.writeObject(internss);
            }
            oos.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
