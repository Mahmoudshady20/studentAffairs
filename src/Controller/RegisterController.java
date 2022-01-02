
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RegisterController {
    @FXML
    private AnchorPane registerwindow;
       @FXML
    void registerAction(ActionEvent event) throws IOException {
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
