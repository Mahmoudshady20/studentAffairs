
package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RCourseController {
     @FXML
    private TextField course2TextField;

    @FXML
    private TextField course5TextField;

    @FXML
    private TextField course3TextField;

    @FXML
    private TextField course1TextField;
    
     @FXML
    private TextField course4TextField;

    @FXML
    private TextField course6TextField;
        @FXML
    private GridPane registercoursewindow;
        @FXML
   void okAction(ActionEvent event) throws IOException {
       registercoursewindow.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/frontend/Main.fxml"));
        Stage gpa = new Stage();
        Scene s2 = new Scene(root);
        gpa.setTitle("Main");
        gpa.setScene(s2);
        gpa.show();
    }
}
