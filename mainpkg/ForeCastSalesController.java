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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ForeCastSalesController implements Initializable {

    @FXML
    private TextField salesForecastOnClick;
    @FXML
    private TextField totalSaleProductOnClick;
    @FXML
    private TableView<Forecast> tableViewOnClick;
    @FXML
    private TableColumn<Forecast, String> productNameTableOnClick;
    @FXML
    private TableColumn<Forecast, String> monthTableOnClick;
    @FXML
    private TableColumn<Forecast, String> salesForsecastTableOnClick;
    @FXML
    private TableColumn<Forecast, String> totalSaleTableOnClick;
    @FXML
    private ComboBox<String> monthComboBoxOnClick;
    
    private ArrayList<Forecast>foresale= new ArrayList<>();
    @FXML
    private ComboBox<String> productNameComboBoXOnClick;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         monthComboBoxOnClick.getItems().addAll("January","May","September");
         productNameComboBoXOnClick.getItems().addAll("Tiles","Glass","Porcelain","Bonechina");
       
    }    


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
    private void addButtonOnClick(ActionEvent event) {
        
        Forecast item =new Forecast ( productNameComboBoXOnClick.getValue(),monthComboBoxOnClick.getValue(),
                 salesForecastOnClick.getText(),totalSaleProductOnClick.getText());
        
        foresale.add(item);
        
         productNameTableOnClick.setCellValueFactory(new PropertyValueFactory<>("productName"));
        monthTableOnClick.setCellValueFactory(new PropertyValueFactory<>("month"));
        salesForsecastTableOnClick.setCellValueFactory(new PropertyValueFactory<>("salesForsecast"));
        totalSaleTableOnClick.setCellValueFactory(new PropertyValueFactory<>("totalSaleTable"));
        
        
    }

    @FXML
    private void generateForecastButtonClick(ActionEvent event) {
        for(Forecast c:foresale){
          tableViewOnClick.getItems().add(
                new Forecast(c.getProductName(),c.getMonth(),
                        c.getSalesForecast(),c. getTotalSaleProduct())
        );  
        
    }
    
}

    @FXML
    private void selectProductButtonOnClick(ActionEvent event) {
        
      switch (productNameComboBoXOnClick.getValue()){
            case "Tiles":
                salesForecastOnClick.setText("1200");
                totalSaleProductOnClick.setText("890");
                break;
             case "Glass":
                salesForecastOnClick.setText("1500");
                totalSaleProductOnClick.setText("790");   
               break;
              case "Porcelain":
                salesForecastOnClick.setText("1600");
               totalSaleProductOnClick.setText("1300");  
                break;
                
              case "Bonechina":
                salesForecastOnClick.setText("2200");
                totalSaleProductOnClick.setText("2100");  
                break;  
        }  
    }
}
