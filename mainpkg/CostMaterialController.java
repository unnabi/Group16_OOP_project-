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
public class CostMaterialController implements Initializable {

    @FXML
    private TextField priceOnClick;
    @FXML
    private TextField vatOnClick;
    @FXML
    private ComboBox<Integer> quantityOnClick;
    @FXML
    private TableView<DummyCost> tableViewOnClick;
    private TableColumn<DummyCost, String> productNameTableOnClick;
    @FXML
    private TableColumn<DummyCost, String> priceTableOnClick;
    @FXML
    private TableColumn<DummyCost, String> quantityTableOnClick;
    @FXML
    private TableColumn<DummyCost, String> vatTableOnClick;
    @FXML
    private TableColumn<DummyCost, String> totalCostTableOnClick;
    @FXML
    private ComboBox<String> materialNameOnClick;
  
   
    @FXML
    private TableColumn<DummyCost, String> totalVatTableOnClick;
     private ArrayList<Cost>ct=new ArrayList<>();
    @FXML
    private TableColumn<DummyCost, String> materialNameTableViewOnClick;
    @FXML
    //private TableColumn<?, ?> totalCostTableOnClick1;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         materialNameOnClick.getItems().addAll("Clay","Silica","Feldspar");
         quantityOnClick.getItems().addAll(1,2, 3,4,
              5,6,7,8,9,10);
 
    }    

    @FXML
    private void selectProductButtonOnClick(ActionEvent event) {
        switch (materialNameOnClick.getValue()){
            case "Clay":
                priceOnClick.setText("1200");
               vatOnClick.setText("4");
                break;
             case "Silica":
                priceOnClick.setText("1500");
                vatOnClick.setText("7");   
               break;
             case "Feldspar":
                priceOnClick.setText("1600");
                vatOnClick.setText("6");  
                break;
      }
    }
    @FXML
    private void addbuttonOnClick(ActionEvent event) {
         Cost item =new Cost(( materialNameOnClick.getValue()),Float.parseFloat(priceOnClick.getText()),
                Integer.parseInt( vatOnClick.getText()),quantityOnClick.getValue());
        
        ct.add(item);
      materialNameTableViewOnClick.setCellValueFactory(new PropertyValueFactory<>("materialName"));
      priceTableOnClick.setCellValueFactory(new PropertyValueFactory<>("price"));
       quantityTableOnClick.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        vatTableOnClick.setCellValueFactory(new PropertyValueFactory<>("vat"));
        totalCostTableOnClick.setCellValueFactory(new PropertyValueFactory<>("totalVat"));
       totalVatTableOnClick.setCellValueFactory(new PropertyValueFactory<>("totalCost")); 
    }

    @FXML
    private void viewUpdateTableButtonOnClick(ActionEvent event) {
        for(Cost c:ct){
          tableViewOnClick.getItems().add(
                new DummyCost(c. getMaterialName(),c.getPrice(),
                        c. getVat() ,c.getQuantity(),c.getTotalVat(),c.getTotalCost())
        );  
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
