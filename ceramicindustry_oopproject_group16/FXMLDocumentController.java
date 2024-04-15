
package ceramicindustry_oopproject_group16;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;

/**
 * FXML Controller class
 *
 * @author SHEHAB NABI
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField TFfirstname;
    @FXML
    private TextField TFlastname;
    @FXML
    private TextField TFemail;
    @FXML
    private TextField TFaddress;
    @FXML
    private TextField TFnumber;
    @FXML
    private TextField TFcompany;
    @FXML
    private TextField TFsign;
    private TextField TFshowResult;
    @FXML
    private Button registerbutton;
    @FXML
    private Label labelResult;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void RegisterOnMouseClicked(ActionEvent event) {
        String fstname = TFfirstname.getText(); 
        String lstname = TFlastname.getText();
        String email = TFemail.getText(); 
        String address = TFaddress.getText();
        String num = TFnumber.getText(); 
        String comp = TFcompany.getText();
        String sign = TFsign.getText();
        labelResult.setText("Registration Complete!");
        
        
    }

    @FXML
    private void RegisterOnMouseClicked(MouseDragEvent event) {
    }
    
}
