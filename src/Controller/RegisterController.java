
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RegisterController {
    
    @FXML
    private RadioButton ItRadioButton;

    @FXML
    private RadioButton OtherRadioButton;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private RadioButton level4RadioButton;

    @FXML
    private RadioButton CsRadioButton;

    @FXML
    private RadioButton SeRadioButton;

    @FXML
    private ToggleGroup departmentToggleGroup;

    @FXML
    private RadioButton level2RadioButton;

    @FXML
    private TextField emailTextField;

    @FXML
    private RadioButton level1RadioButton;

    @FXML
    private TextField studentNameTextField;

    @FXML
    private ImageView im1;

    @FXML
    private TextField nationalIdTextField;

    @FXML
    private ToggleGroup levelsButtonsToggleGroup;

    @FXML
    private RadioButton IsRadioButton;

    @FXML
    private RadioButton level3RadioButton;

     @FXML
    private RadioButton OrRadioButton;

    @FXML
    private RadioButton BioRadioButton;
    
    @FXML
    private AnchorPane registerwindow;
    
    
    static String studentName;
    static String nationalId;
    static String studentEmail;
    static String phoneNumber;
    static String studentLevel;
    static String studentDepartment;
    
       @FXML
    void registerAction(ActionEvent event) throws IOException {
        
        studentName=studentNameTextField.getText();
         nationalId=nationalIdTextField.getText();
          studentEmail=emailTextField.getText();
           phoneNumber=phoneNumberTextField.getText();
          if(level1RadioButton.isSelected()){
              studentLevel="Level 1";
          }
           if(level2RadioButton.isSelected()){
              studentLevel="Level 2";
          }
            if(level3RadioButton.isSelected()){
              studentLevel="Level 3";
          }
             if(level4RadioButton.isSelected()){
              studentLevel="Level 4";
          }
        if(CsRadioButton.isSelected()){
            studentDepartment="CS";
        }
         if(ItRadioButton.isSelected()){
            studentDepartment="IT";
        }
         if(IsRadioButton.isSelected()){
            studentDepartment="IS";
        }
         if(OrRadioButton.isSelected()){
            studentDepartment="OR";
        }
        if(BioRadioButton.isSelected()){
            studentDepartment="BIO";
        }
         if(SeRadioButton.isSelected()){
            studentDepartment="SE";
        }
         if(OtherRadioButton.isSelected()){
            studentDepartment="Other";
        } 
        registerwindow.getScene().getWindow().hide();
        Parent coursew;
        coursew = FXMLLoader.load(getClass().getResource("/frontend/registercourse.fxml"));
        Stage register = new Stage();
        Scene s3 = new Scene(coursew);
        register.setTitle("Course");
        register.setScene(s3);
        register.show();
    }
    @FXML
    void Mainwindow(ActionEvent event) throws IOException {
        registerwindow.getScene().getWindow().hide();
        Parent coursew;
        coursew = FXMLLoader.load(getClass().getResource("/frontend/Main.fxml"));
        Stage register = new Stage();
        Scene s3 = new Scene(coursew);
        register.setTitle("Main");
        register.setScene(s3);
        register.show();
    }
}
