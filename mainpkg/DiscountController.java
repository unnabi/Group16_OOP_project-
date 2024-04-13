/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class DiscountController implements Initializable {

    @FXML
    private TextField unitPriceOnClick;
    @FXML
    private TableView<Dummy> tableViewOnClick;
    @FXML
    private TableColumn<Dummy, String> productNameOnTableViewClick;
    @FXML
    private TableColumn<Dummy, String> unitPriceOnTableClick;
    @FXML
    private TableColumn<Dummy, String> quantityTableViewOnClick;
    @FXML
    private TableColumn<Dummy, String> discountTableViewOnClick;
    @FXML
    private TableColumn<Dummy, String> totalPriceTableViewOnClick;
    @FXML
    private ComboBox<Integer> quantityOnClickCB;
    @FXML
    private TextField percentageDiscountOnClick;
    private ArrayList<Discount>disList=new ArrayList<>();
    @FXML
    private ComboBox<String> productNameOnClickCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productNameOnClickCB.getItems().addAll("Tiles","Glass","porcelain","Bonechina");
        quantityOnClickCB.getItems().addAll(1,2,3,4,5);
    }    

    @FXML
    private void generateDiscountTableButtonOnClick(ActionEvent event) {
        for(Discount c:disList){
          tableViewOnClick.getItems().add(
                new Dummy(c.getProductName(),c.getUnitPrice(),c.getQuantity(),
                        c.getPercentageDiscount(),  c.getTotalPrice())
         );
          
        }
    }
   

    @FXML
    private void productButtonOnClick(ActionEvent event) {
        switch (productNameOnClickCB.getValue()){
            case "Tiles":
                unitPriceOnClick.setText("500");
                percentageDiscountOnClick.setText("2");
                break;
             case "Glass":
                unitPriceOnClick.setText("700");
                percentageDiscountOnClick.setText("3");   
               break;
              case "porcelain":
                unitPriceOnClick.setText("890");
               percentageDiscountOnClick.setText("2");  
                break;
              case"Bonechina":
                unitPriceOnClick.setText("1200");
                percentageDiscountOnClick.setText("2");  
                break;
    }
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) {
      Discount item =new Discount((productNameOnClickCB.getValue()),Float.parseFloat(unitPriceOnClick.getText()),
                 quantityOnClickCB.getValue(),Integer.parseInt(discountTableViewOnClick.getText()));
        
        disList.add(item);  
        
      productNameOnTableViewClick.setCellValueFactory(new PropertyValueFactory<>("productName"));
        unitPriceOnTableClick.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
       quantityTableViewOnClick.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        discountTableViewOnClick.setCellValueFactory(new PropertyValueFactory<>("Discount"));
        totalPriceTableViewOnClick.setCellValueFactory(new PropertyValueFactory<>("TotalPrice")); 
        
        
        
        
        
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
