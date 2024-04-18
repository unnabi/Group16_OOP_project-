/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class PerformanceController implements Initializable {

    @FXML
    private PieChart pieChartOnClick;
    @FXML
    private TextField productNameOnClick;
    @FXML
    private TextField productRatingOnClick;
    @FXML
    private Button loadPieChart1OnClick;
    @FXML
    private Button loadPieChartOnClick;
    @FXML
    private Label labelOnClick;
    private ObservableList <PieChart.Data> list 
            = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         Alert a = new Alert(Alert.AlertType.ERROR);
    }    

    @FXML
    private void addNewItemButtonOnClick(ActionEvent event) {
        PieChart.Data newItem = 
            new PieChart.Data(
                productNameOnClick.getText(),
                Double.parseDouble(productRatingOnClick.getText())
            );
        
        pieChartOnClick.getData().add(newItem );
        
        newItem.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, 
                new EventHandler<MouseEvent>(){
                    @Override
                    public void handle(MouseEvent event) {
                        labelOnClick.setText(String.valueOf(newItem.getPieValue()));
                        Alert a = new Alert(Alert.AlertType.INFORMATION);
                        a.setContentText(newItem.getName() + " is known by "
                                + String.valueOf(newItem.getPieValue()) + " Product.");
                        a.showAndWait();
                    }
                }
        );
        
    }

    @FXML
    private void loadPieChartButtonOnClick(ActionEvent event) {
         pieChartOnClick.getData().clear();
        //pieChart.getData().add(new PieChart.Data("Java",50));
        list.add( new PieChart.Data("Tiles",7) );
        list.add( new PieChart.Data("Glass",8) );
        list.add( new PieChart.Data("Porcelain",9) );
        list.add( new PieChart.Data("BoneChina",10) );
        
        //ObservableList <PieChart.Data> list2 = FXCollections.observableArrayList();
        //list2.add(new PieChart.Data("Java",50));
        //...
        pieChartOnClick.setData(list);
        
        for(PieChart.Data data:  pieChartOnClick.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, 
                new EventHandler<MouseEvent>(){
                    @Override
                    public void handle(MouseEvent event) {
                        labelOnClick.setText(String.valueOf(data.getPieValue()));
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                }
            );
            
        }
    }

    @FXML
    private void labelMoseOnButtonClick(MouseEvent event) {
        labelOnClick.setText("Performance rating on product");
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
