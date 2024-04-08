/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

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
public class ForecastSaleController implements Initializable {

    @FXML
    private TextField salesForecastOnClick;
    @FXML
    private ComboBox<String> selectProductOnCBClick;
    @FXML
    private TextField totalSaleProductOnClick;
    @FXML
    private TextField monthTextOnClick;
    private TableView<Dummy> tableViewOnClick;
    private TableColumn<Dummy, String> productNameTableOnClick;
    private TableColumn<Dummy, String> monthTableOnClick;
    private TableColumn<Dummy, Integer> salesForecastTableOnClick;
    private TableColumn<Dummy, Integer> totalSalesTableOnClick;
    
   
    private TableColumn<Dummy, Float> differenceSaleOnClick;
     private ArrayList<Forecast>foresale=new ArrayList<>();
    @FXML
    private TextArea TextAreaOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectProductOnCBClick.getItems().addAll("Tiles","Glass","Porcelain",
                 "Bonechina");
        
         productNameTableOnClick.setCellValueFactory(new PropertyValueFactory<>("productname"));
        monthTableOnClick.setCellValueFactory(new PropertyValueFactory<>("month"));
        salesForecastTableOnClick.setCellValueFactory(new PropertyValueFactory<>("saleforecast"));
       totalSalesTableOnClick.setCellValueFactory(new PropertyValueFactory<>("totalsale"));
        differenceSaleOnClick.setCellValueFactory(new PropertyValueFactory<>("DifferenceSale"));
        
        
       
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
    private void addButtonOnClick(ActionEvent event) {
        Forecast product = new Forecast((selectProductOnCBClick.getValue()), monthTextOnClick.getText(),
                Integer.parseInt(salesForecastOnClick.getText()), Integer.parseInt(totalSaleProductOnClick.getText()));

       // foresale.add(product);

//      productNameTableOnClick.setCellValueFactory(new PropertyValueFactory<>("productname"));
//        monthTableOnClick.setCellValueFactory(new PropertyValueFactory<>("month"));
//        salesForecastTableOnClick.setCellValueFactory(new PropertyValueFactory<>("saleforecast"));
//       totalSalesTableOnClick.setCellValueFactory(new PropertyValueFactory<>("totalsale"));
//        differenceSaleOnClick.setCellValueFactory(new PropertyValueFactory<>("DifferenceSale"));
//        tableViewOnClick.setItems(product);
       for (Forecast f : foresale){
         ////////tableViewOnClick.setItems(f.toString());
          
          
        }


    }
        
    

    private void generateForecastButtonOnClick(ActionEvent event) {
       
        
    }


    @FXML
    private void appendObjectToBinaryFileButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("ForecastObjects.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            Forecast e = new Forecast((selectProductOnCBClick.getValue()), monthTextOnClick.getText(),
                Integer.parseInt(salesForecastOnClick.getText()),
                    Integer.parseInt(totalSaleProductOnClick.getText()));   
           
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
    private void readObjectsFromFileButtonOnClick(ActionEvent event) {
       TextAreaOnClick.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("ForecastObjects.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
             Forecast emp;
            try{
                TextAreaOnClick.setText("");
                while(true){
                    System.out.println("Printing objects.");
                    emp = (Forecast)ois.readObject();
                    //Object obj = ois.readObject();
                    //obj.submitReport();
                    emp.submitReport();
                    System.out.println(emp.toString());
                     TextAreaOnClick.appendText(emp.toString());
                }
            }//end of nested try
            catch(Exception e){
                // handling code
            }//nested catch     
             TextAreaOnClick.appendText("All objects are loaded successfully...\n");            
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } 
        finally {
            try {
                
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }            
        
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
        
    }

    

    
    
