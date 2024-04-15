/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Retailer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class FeedBack_user1Controller implements Initializable {

    @FXML
    private TextField employeeNameTextField;
    @FXML
    private TextField contactNumberTextField;
    @FXML
    private TextArea feedbackTextArea;
    
    ToggleGroup tg;
    Alert alert;
    @FXML
    private RadioButton ConcernRedioButtton;
    @FXML
    private RadioButton suggestRedioButtton;
    @FXML
    private RadioButton praiseRedioButtton;
    @FXML
    private TextField EmailTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        tg = new ToggleGroup();
        
        ConcernRedioButtton.setToggleGroup(tg);
        suggestRedioButtton.setToggleGroup(tg);
        praiseRedioButtton.setToggleGroup(tg);
        
        
        // TODO
    }
    
    private Boolean selectRadioButton(){
        Boolean selection = false;
        if(ConcernRedioButtton.isSelected() || suggestRedioButtton.isSelected() || praiseRedioButtton.isSelected()){
            selection = true;
        }
        return selection;
    }
    
    private String choiceOfRadioButton(){
        
        String choose = "";
        
        if(ConcernRedioButtton.isSelected()){
            
            choose = "Concern";
        
        }
        if(suggestRedioButtton.isSelected()){
            
            choose = "Suggestion";

        }
        if(praiseRedioButtton.isSelected()){
            
            choose = "Praise";
        
        }
        return choose;
    
    }

    private void sendFeedbackOnMouseClick(ActionEvent event) throws IOException {
        
        if (employeeNameTextField.getText().isEmpty() || EmailTextField.getText().isEmpty() || 
                contactNumberTextField.getText().isEmpty() || feedbackTextArea.getText().isEmpty() ||
                selectRadioButton().equals(false)){
            
            alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning Alert");
            alert.setContentText("Please give proper Information");
            alert.setHeaderText(null);
            alert.showAndWait();
        
        }
        else{
            FeedBack feed = new FeedBack(employeeNameTextField.getText(),feedbackTextArea.getText(),choiceOfRadioButton(),
                    Integer.parseInt(EmailTextField.getText()),Integer.parseInt(contactNumberTextField.getText()));
            
            Retailer.storeFeedbackToFile(feed,"FeedBackFile.bin");
            
             alert = new Alert(Alert.AlertType.INFORMATION);
             alert.setTitle("Information");
             alert.setContentText("Feedback is submitted Succesfully.");
             alert.setHeaderText(null);
             alert.showAndWait();
            
            
        }
    }

    @FXML
    private void sentOnmouseclicked(ActionEvent event) {
    }
    
}
