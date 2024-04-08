/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
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
    private TableView<?> tableViewOnClick;
    @FXML
    private TableColumn<?, ?> productNameOnTableViewClick;
    @FXML
    private TableColumn<?, ?> unitPriceOnTableClick;
    @FXML
    private TableColumn<?, ?> quantityTableViewOnClick;
    @FXML
    private TableColumn<?, ?> discountTableViewOnClick;
    @FXML
    private TableColumn<?, ?> totalPriceTableViewOnClick;
    @FXML
    private ComboBox<?> selectProductOnClickCB;
    @FXML
    private ComboBox<?> quantityOnClickCB;
    @FXML
    private TextField percentageDiscountOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generateDiscountTableButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void productButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) {
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
