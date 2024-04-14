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
public class ReturnProductController implements Initializable {

    @FXML
    private TextField clientIdOnClick;
    @FXML
    private TextField transactionIdOnClick;
    @FXML
    private DatePicker dateOnClick;
    @FXML
    private TextArea textAreaOnClick;
    @FXML
    private ComboBox<Integer> comBoxOnClick;
     private ArrayList<Return>rtn=new ArrayList<>();
    @FXML
    private TextField productIdOnClick;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addItemButtonOnClick(ActionEvent event) {
        int ClientId=Integer.parseInt(clientIdOnClick.getText());
        String TransactionId=transactionIdOnClick.getText();
        int ProductId=Integer.parseInt(productIdOnClick.getText());
        LocalDate Date=dateOnClick.getValue();
        
        Return newstudent= new Return( ClientId,TransactionId,ProductId,Date);
        
        comBoxOnClick.getItems().add(ClientId);
        
        rtn.add(newstudent);
        
        
        
        
        
        clientIdOnClick.clear();
        transactionIdOnClick.clear();
        productIdOnClick.clear();
    }

    @FXML
    private void getReturnButtonOnClick(ActionEvent event) {
        Integer selectedId=  comBoxOnClick.getValue();
        for (Return st :rtn){
            if (st. getClientId()==selectedId){
                textAreaOnClick.setText("ClientId: " +st.getClientId() + "\nTransactionId:" + st.getTransactionId() + "\nProductId:" + st.getProductId() +
                        "\nDate:" + st.getDate());
            break;
              
            }
            
            
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("RawMaterialDashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
    
}
