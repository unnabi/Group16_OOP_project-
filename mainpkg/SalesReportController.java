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
public class SalesReportController implements Initializable {

    @FXML
    private TextField unitPriceOnClick;
    @FXML
    private ComboBox<Integer> quantityOnClickCBFField;
    @FXML
    private TextField vatOnClick;
    @FXML
    private TableView<DummySalesReport> tableViewOnClick;
    @FXML
    private TableColumn<DummySalesReport, String> productNameOnTableViewClick;
    @FXML
    private TableColumn<DummySalesReport, String> unitPriceOnTableViewClick;
    @FXML
    private TableColumn<DummySalesReport, String> quantityOnTableViewClick;
    @FXML
    private TableColumn<DummySalesReport, String> vatOnTableViewClick;
    @FXML
    private TableColumn<DummySalesReport,String > totalvatOnTableViewClick;
    @FXML
    private TableColumn<DummySalesReport, String> totalAmountOnTableViewClick;
    @FXML
    private ComboBox<String> productNameOnClickCB;
    private ArrayList<SalesReport>sreport=new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  productNameOnClickCB.getItems().addAll("Tiles","Glass","Porcelain");
   quantityOnClickCBFField.getItems().addAll(1,2, 3,4,
              5,6,7,8,9,10);
    }    

    @FXML
    private void selectProductOnButtonClick(ActionEvent event) {
        switch (productNameOnClickCB.getValue()){
            case "Tiles":
                unitPriceOnClick.setText("1200");
               vatOnClick.setText("4");
                break;
             case "Glass":
                unitPriceOnClick.setText("1500");
                vatOnClick.setText("7");   
               break;
              case "Porcelain":
                unitPriceOnClick.setText("1600");
                vatOnClick.setText("6");  
                break;
        }
    }

    @FXML
    private void additemButtonOnAction(ActionEvent event) {
        SalesReport item =new SalesReport((productNameOnClickCB.getValue()),Float.parseFloat(unitPriceOnClick.getText()),
                Integer.parseInt( vatOnClick.getText()),quantityOnClickCBFField.getValue());
        
        sreport.add(item);
      productNameOnTableViewClick.setCellValueFactory(new PropertyValueFactory<>("productName"));
       unitPriceOnTableViewClick.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        quantityOnTableViewClick.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        vatOnTableViewClick.setCellValueFactory(new PropertyValueFactory<>("vat"));
        totalvatOnTableViewClick.setCellValueFactory(new PropertyValueFactory<>("vtotalVat"));
       totalAmountOnTableViewClick.setCellValueFactory(new PropertyValueFactory<>("totalAmount")); 
        
        
    }

    @FXML
    private void generateTableOnButtonClick(ActionEvent event) {
        for(SalesReport c:sreport){
          tableViewOnClick.getItems().add(
                new DummySalesReport(c.getProductName(),c.getUnitPrice(),
                        c. getVat(),c.getQuantity(),c.getTotalvat(),c.getTotalAmount())
        );  
    }
    }
    @FXML
    private void gobackButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SalesOfficerDashboard_1.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
    
}
