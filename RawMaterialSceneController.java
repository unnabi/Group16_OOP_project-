/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author NUSRAT JAHAN
 */
public class RawMaterialSceneController implements Initializable {

    @FXML
    private TableColumn<rawMaterial, Integer> quantityOnClick;
    @FXML
    private TableColumn<rawMaterial, Integer> priceOnClick;
    @FXML
    private TableColumn<rawMaterial, String> delivaryDateOnClick;
    @FXML
    private TableColumn<rawMaterial, String> rawMaterialcolumn;
    @FXML
    private TableView<rawMaterial> rawMaterialTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void submitOnClick(ActionEvent event) {
    }
    
}
