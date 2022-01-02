package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private AnchorPane mainwindow;
    @FXML
    void Registerpage(ActionEvent event) throws IOException {
        mainwindow.getScene().getWindow().hide();
        Parent regw;
        regw = FXMLLoader.load(getClass().getResource("/frontend/Register.fxml"));
        Stage register = new Stage();
        Scene s1 = new Scene(regw);
        register.setTitle("Register");
        register.setScene(s1);
        register.show();
    }
        @FXML
    void GpaPage(ActionEvent event) throws IOException {
        mainwindow.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/frontend/Logingpa.fxml"));
        Stage gpa = new Stage();
        Scene s2 = new Scene(root);
        gpa.setTitle("GPA");
        gpa.setScene(s2);
        gpa.show();
    }
}
