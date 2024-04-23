/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class AchieveSalesTargetController implements Initializable {

    @FXML
    private TextField soldProductOnClick;
    @FXML
    private TextArea textAreaOnClick;
    @FXML
    private TextField targetSoldOnClick;
    @FXML
    private ComboBox<String> productNameOnClickCB;
    @FXML
    private TextField monthOnClick;
    private ArrayList<Target>tgList= new ArrayList<>();
    @FXML
    private ComboBox<String> comboBoxOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productNameOnClickCB.getItems().addAll("Tiles","Bone China","Glass","Porcelain");
    }
        // TODO
        


    @FXML
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SalesOfficerDashboard_1.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void appendObjectToBinaryFileButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Target.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            Target e = new Target(
                productNameOnClickCB.getValue(),
                 monthOnClick.getText(),
                targetSoldOnClick.getText(),
                soldProductOnClick.getText());    
            
            oos.writeObject(e);

        } catch (IOException ex) {
            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }

    @FXML
    private void viewDetailsButtonOnClick(ActionEvent event) {
       String selectedName=  productNameOnClickCB.getValue();
        for (Target st :tgList){
            if (st.getProductName()==selectedName){
               textAreaOnClick.setText("ProductName: " + st.getProductName() + "\nmonth:" + st.getMonth() + "\ntargetSold:" + st. getTargetSold() + 
                       "\nSoldProduct:" 
                       + st.getSoldProduct());
            break;
              
          }
        
  }
    
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) {
        String ProductName =productNameOnClickCB.getValue();
        String Month= monthOnClick.getText();
       String TargetSold =targetSoldOnClick.getText();
        String SoldProduct=soldProductOnClick.getText();
        Target newstudent= new Target(ProductName, Month,TargetSold,SoldProduct);
        
       comboBoxOnClick.getItems().add(ProductName);
        
       tgList.add(newstudent);
    }
}