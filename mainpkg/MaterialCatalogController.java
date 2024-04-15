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
public class MaterialCatalogController implements Initializable {

    @FXML
    private ComboBox<Integer> comboBoxOnClick;
    @FXML
    private TextArea textAreaOnClick;
    @FXML
    private TextField productIdOnClick;
    @FXML
    private DatePicker manufactureDateOnClick;
    @FXML
    private DatePicker expireDateOnClick;
     private ArrayList<Catalog>ctg=new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addButtonOnClick(ActionEvent event) {
        int ProductId=Integer.parseInt(productIdOnClick.getText());
       LocalDate ManufactureDate = manufactureDateOnClick.getValue();
       LocalDate ExpireDate=expireDateOnClick.getValue();
        
       Catalog  pro= new Catalog(ProductId,ManufactureDate,ExpireDate);
        
        comboBoxOnClick.getItems().add(ProductId);
        
        ctg.add(pro);
        
        
        
        
        
        productIdOnClick.clear();
        
    }

    @FXML
    private void checkCatalogButtonOnClick(ActionEvent event) {
         Integer selectedId=   comboBoxOnClick.getValue();
        for (Catalog st :ctg){
            if (st. getProductId()==selectedId){
                textAreaOnClick.setText("productId: " +st.getProductId() + "\nManufactureDate:" + st.getManufactureDate() + "\nExpireDate:"
                        + st. getExpireDate());
            break;
              
            }
            
            
        }
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("RawMaterialDashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
    
}
