/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountant_User4;

import static hrExecutive_User3.HRExecutive.loadInternList;
import hrExecutive_User3.Intern;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class Accountant extends User implements Serializable{
    
    public Accountant(String fullName, String userName, String phoneNumber, String password, LocalDate Dob) {
        super(fullName, userName, phoneNumber, password, Dob);
    }
     
    public static void storeFeedbackToFile(FeedBack feedback, String fileN) throws IOException{
        ArrayList<FeedBack> feedBackStorage = loadFeedbackFromFile(fileN);
        feedBackStorage.add(feedback);
        
        try{
            
            FileOutputStream fos = new FileOutputStream(fileN);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(FeedBack feedB : feedBackStorage){
                oos.writeObject(feedB);
            }
            oos.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static ArrayList<FeedBack> loadFeedbackFromFile(String fileName){
        
        ArrayList<FeedBack> feedbackStore = new ArrayList();
        
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                try{
                    FeedBack feedBa = (FeedBack) ois.readObject();
                    feedbackStore.add(feedBa);
                
                }catch(Exception e){
                    break;
                }
            
            }
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    return feedbackStore;
    
    
    }
    
    public static ArrayList<Salary> loadSalaryDeclarationDataFromFile(String fileName){
        
        ArrayList<Salary> salaryData = new ArrayList();
        
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                try{
                    Salary data = (Salary) ois.readObject();
                    salaryData.add(data);
                
                }catch(Exception e){
                    break;
                }
            
            }
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    return salaryData;
    
    
    }
    
       public static void storeSalaryDeclarationDataToFile(Salary salary, String fileN) throws IOException{
        ArrayList<Salary> salaryData = loadSalaryDeclarationDataFromFile(fileN);
        salaryData.add(salary);
        
        try{
            
            FileOutputStream fos = new FileOutputStream(fileN);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(Salary s : salaryData){
                oos.writeObject(s);
            }
            oos.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
