/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author NUSRAT JAHAN
 */
public class MaterialcostController implements Initializable {

    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> materialListColum;
    @FXML
    private TableColumn<?, ?> priceColoum;
    @FXML
    private TableColumn<?, ?> vatcoloum;
    @FXML
    private TableColumn<?, ?> quantityColoum;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
