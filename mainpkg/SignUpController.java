package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController implements Initializable {

    @FXML
    private TextField newUserNameTextField;
    @FXML
    private TextField newUserPhoneNumberTextField;
   
    @FXML
    private TextField newPasswordTextField;
    @FXML
    private TextField confirmPasswordTextField;
    @FXML
    private DatePicker newUserDob;
    @FXML
    private Button goback;
    @FXML
    private TextField newNameTextField;
    @FXML
    private ComboBox<String> userTypeComboBox;
    @FXML
    private Button signup;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeComboBox.getItems().addAll("Retailer", "Manufacturing Machine Operator",
                "Accountant", "HR executive", "Sales Officer",
                 "Raw Material Supplier", "Production Manager", "CEO");
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginSc.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage currentStage = (Stage) goback.getScene().getWindow();
            currentStage.setScene(scene);
        } catch (IOException e) {
            showAlert("Error", "Error Loading Scene", "An error occurred while loading the login scene.");
        }
    }

    private void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    private void createAccountButtonOnClick(ActionEvent event) {
        String fullName=newNameTextField.getText();
        String userName = newUserNameTextField.getText();
        String phoneNumber = newUserPhoneNumberTextField.getText();       
        String password = newPasswordTextField.getText();
        String confirmPassword = confirmPasswordTextField.getText();
        LocalDate dob = newUserDob.getValue();       
        User newUser = new User(fullName,userName, phoneNumber, password, dob);
        Boolean success = SignUpFile.SignUpFileWrite(newUser, userTypeComboBox.getValue());
        if(success){
            System.out.println(success);
            Alert a = new Alert(AlertType.CONFIRMATION);
            a.setHeaderText("Confirmed");
            a.setContentText("Your SignUp is Completed");
            a.showAndWait();
        }
       else{
            System.out.println(success);
            Alert a = new Alert(AlertType.ERROR);
            a.setHeaderText("ERROR");
            a.setContentText("Your SignUp is Incomplete.PLEASE TRY AGAIN");
            a.showAndWait();
        }
        newNameTextField.clear();
        newUserNameTextField.clear();
        newUserPhoneNumberTextField.clear();       
        newPasswordTextField.clear();
        confirmPasswordTextField.clear();
        newUserDob.setValue(null);
    }
}
