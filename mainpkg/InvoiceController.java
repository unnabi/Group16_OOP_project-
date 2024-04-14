/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class InvoiceController implements Initializable {

    @FXML
    private TextField productIdOnClick;
    @FXML
    private TextField instituteNameOnClick;
    @FXML
    private DatePicker dateInvoiceOnClick;
    @FXML
    private ComboBox<String> comboBoxOnClick;
    @FXML
    private TextArea textAreaOnClick;
    @FXML
    private ComboBox<String> productNameCBClick;
    private ArrayList<Invoice>ivce=new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productNameCBClick.getItems().addAll("Tiles","Bone China","Glass","Porcelain");
        // TODO
    }    

    @FXML
    private void generateInvoiceButtonOnClick(ActionEvent event) throws IOException {
         String selectedId= comboBoxOnClick.getValue();
        for (Invoice st :ivce){
            if (st. getProductId()==selectedId){
               textAreaOnClick.setText("ProductName: " + st.getProductName() + "\nProductId:" + st.getProductId() + "\nInstituteName:" + st. getInstituteName() + 
                       "\nDate:" 
                       + st.getDateInvoice());
            break;
    }
        }
    }
    @FXML
   private void selectIdButtonOnClick(ActionEvent event) throws IOException {
        String ProductName =productNameCBClick.getValue();
        String productId= productIdOnClick.getText();
         String InstituteName=instituteNameOnClick.getText();
         LocalDate  DateInvoice=dateInvoiceOnClick.getValue();
        Invoice newstudent= new Invoice(productId, ProductName,InstituteName, DateInvoice);
        
       comboBoxOnClick.getItems().add(productId);
        
       ivce.add(newstudent);
        
        }           
   
    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SalesOfficerDashboard_1.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
}    

