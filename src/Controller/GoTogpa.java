package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author pc
 */
public class GoTogpa {
        @FXML
    private AnchorPane LoginGpa;

    @FXML
    void GoToGpa(ActionEvent event) throws IOException {
    LoginGpa.getScene().getWindow().hide();
    Parent root = FXMLLoader.load(getClass().getResource("/frontend/Gpa.fxml"));
        Stage gpa = new Stage();
        Scene s2 = new Scene(root);
        gpa.setTitle("Main");
        gpa.setScene(s2);
        gpa.show();
    }
}
