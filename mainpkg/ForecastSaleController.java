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
public class ForecastSaleController implements Initializable {

    @FXML
    private TextField salesForecastOnClick;
    @FXML
    private ComboBox<String> selectProductOnCBClick;
    @FXML
    private TextField totalSaleProductOnClick;
    @FXML
    private TextField monthTextOnClick;
    @FXML
    private TableView<Dummy> tableViewOnClick;
    @FXML
    private TableColumn<Dummy, String> productNameTableOnClick;
    @FXML
    private TableColumn<Dummy, String> monthTableOnClick;
    @FXML
    private TableColumn<Dummy, Integer> salesForecastTableOnClick;
    @FXML
    private TableColumn<Dummy, Integer> totalSalesTableOnClick;
    
   
    @FXML
    private TableColumn<Dummy, Float> differenceSaleOnClick;
     private ArrayList<Forecast>foresale=new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectProductOnCBClick.getItems().addAll("Tiles","Glass","Porcelain",
                 "Bonechina");
        
       
    }    

    @FXML
    private void onButtonSelectProductCBClick(ActionEvent event) {
        switch (selectProductOnCBClick.getValue()){
            case "Tiles":
                salesForecastOnClick.setText("2000");
                totalSaleProductOnClick.setText("1500");
                break;
             case "Glass":
                 salesForecastOnClick.setText("1200");
                totalSaleProductOnClick.setText("890");
                 break;  
               
              case "Porcelain":
                 salesForecastOnClick.setText("1500");
                 totalSaleProductOnClick.setText("678");
                 break;  
              case "Bonechina":
                 salesForecastOnClick.setText("1300");
                 totalSaleProductOnClick.setText("900");
                 break;   
    }
        
    }
    @FXML
    private void addButtonOnClick(ActionEvent event) {
        Forecast product =new Forecast((selectProductOnCBClick.getValue()), monthTextOnClick.getText(),
                Integer.parseInt( salesForecastOnClick.getText()), Integer.parseInt(totalSaleProductOnClick.getText()));
        
       foresale.add(product);
       
      productNameTableOnClick.setCellValueFactory(new PropertyValueFactory<>("productname"));
        monthTableOnClick.setCellValueFactory(new PropertyValueFactory<>("month"));
        salesForecastTableOnClick.setCellValueFactory(new PropertyValueFactory<>("saleforecast"));
       totalSalesTableOnClick.setCellValueFactory(new PropertyValueFactory<>("totalsale"));
        differenceSaleOnClick.setCellValueFactory(new PropertyValueFactory<>("DifferenceSale"));
        
    }
        
    

    @FXML
    private void generateForecastButtonOnClick(ActionEvent event) {
        for(Forecast c:foresale){
          tableViewOnClick.getItems().add(
                new Dummy(c.getProductname(),c.getMonth() ,
                        c.getSalesforecast(),c.getTotalsale(),c.getSalesDiff())
          );
        
    }
        
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
