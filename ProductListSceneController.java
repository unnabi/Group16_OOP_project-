/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
 * @author NUSRAT JAHAN
 */
public class ProductListSceneController implements Initializable {

    @FXML
    private TableColumn<?, ?> producrNameOnClick;
    @FXML
    private TableColumn<?, ?> productCodeOnClick;
    @FXML
    private TableColumn<?, ?> orderDateOnClick;
    @FXML
    private TableColumn<?, ?> manufactureDateOnClick;
    @FXML
    private TableColumn<?, ?> delivaryDateOnClick;
    @FXML
    private TableView<?> pruductlisttable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backOnClick(ActionEvent event) {
    }

    @FXML
    private void doneOnClick(ActionEvent event) {
    }

    @FXML
    private void productListWriteFileButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("EmpObjects.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            SalesTarget e = new SalesTarget(
                Integer.parseInt(idTextField.getText()),
                nameTextField.getText(),
                desigTextField.getText(),
                Float.parseFloat(salaryTextField.getText())    
            );
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

    private static class AppendableObjectOutputStream extends ObjectOutputStream {

        public AppendableObjectOutputStream(FileOutputStream fos) {
        }
    }
    
}
