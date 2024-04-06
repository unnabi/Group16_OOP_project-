/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hrExecutive_User3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class InternSelectionController implements Initializable {

    @FXML
    private TextField internNameTextField;
    @FXML
    private TextField internIDTextField;
    @FXML
    private TextField internContactNumTextField;
    @FXML
    private ComboBox<String> uniNameComboBox;
    @FXML
    private ComboBox<String> recruitedDeptComboBox;
    @FXML
    private RadioButton isPaidRadioButton;
    @FXML
    private RadioButton isNonPaidRadioButton;
    @FXML
    private DatePicker recruitedDatePicker;

    ArrayList<Intern> internList;

    ToggleGroup tg;

    Alert alert;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        uniNameComboBox.getItems().addAll("IUB", "NSU", "BracU", "UIU", "AUST", "DU");
        recruitedDeptComboBox.getItems().addAll("Manufacturing Machine Operator", "Accountant",
                "HR executive", "Sales Officer", "Production Manager");

        internList = new ArrayList();

        tg = new ToggleGroup();

        isPaidRadioButton.setToggleGroup(tg);
        isNonPaidRadioButton.setToggleGroup(tg);

    }

    private Boolean radioButtonIsSelected() {
        Boolean select = false;
        if (isPaidRadioButton.isSelected() || isNonPaidRadioButton.isSelected()) {

            select = true;

        }
        return select;

    }

    private String selectRadioButton() {
        String status = "";

        if (isNonPaidRadioButton.isSelected()) {

            status = "Non-Paid";

        }

        if (isPaidRadioButton.isSelected()) {

            status = "Paid";

        }
        return status;
    }

    @FXML
    private void hireInternOnMouseClick(ActionEvent event) throws IOException {
        
        if (internNameTextField.getText().isEmpty() || internIDTextField.getText().isEmpty()
                || internContactNumTextField.getText().isEmpty() || uniNameComboBox.getValue() == null || recruitedDeptComboBox.getValue() == null
                || radioButtonIsSelected().equals(false) || recruitedDatePicker.getValue().toString().isEmpty()) {

            alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning Alert");
            alert.setContentText("Please give proper Information");
            alert.setHeaderText(null);
            alert.showAndWait();
        } 
        else {
            
            Boolean success = false;
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File("InternObject.bin");

                if (!f.exists()) {

                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);

                } else {

                    fos = new FileOutputStream(f, true);
                    oos = new ObjectOutputStream(fos);

                }
//                internList.add( new Intern(
//            internNameTextField.getText(),uniNameComboBox.getValue(),recruitedDeptComboBox.getValue(),selectRadioButton(),
//                        Integer.parseInt(internIDTextField.getText()),Integer.parseInt(internContactNumTextField.getText()),
//                        recruitedDatePicker.getValue()));

                Intern intern = new Intern(internNameTextField.getText(),uniNameComboBox.getValue(),recruitedDeptComboBox.getValue(),selectRadioButton(),
                        Integer.parseInt(internIDTextField.getText()),Integer.parseInt(internContactNumTextField.getText()),
                        recruitedDatePicker.getValue());
                
                oos.writeObject(intern);
                
                success = true;

            }catch(Exception e){
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning Alert");
                alert.setContentText(e.toString()+" error occured!!");
                alert.setHeaderText(null);
                alert.showAndWait();
            }   finally{ 
                oos.close();
            }
            
            if(success == true){
                
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setContentText("Employee Successfully Added.");
                alert.setHeaderText(null);
                alert.showAndWait();
            
            }
            

        }

    }

}
