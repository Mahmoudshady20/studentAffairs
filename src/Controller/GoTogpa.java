package Controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import studentaffers.Database;

/**
 * @author pc
 */
public class GoTogpa {
    

    @FXML
    private TextField nationalIdGpaPage;

    @FXML
    private TextField studentNameGpaPage;
    
        @FXML
    private AnchorPane LoginGpa;
String nationalId;
    Connection connection;
String studentName;
    @FXML
    void GoToGpa(ActionEvent event) throws IOException {
        GPAController gpaControllerObj=new GPAController();
        nationalId=nationalIdGpaPage.getText();
        studentName=studentNameGpaPage.getText();
        try{
            connection=new Database().connectWithDataBase();
            System.out.println("Connection done with database in Login GPA ##");
            String sqlCommand="select * from studentaffairs.studentsdata where nationalid = \""+nationalId+"\";";
            System.out.println("Getting data Sql Command ->"+sqlCommand);
           try{
                 ResultSet rs=connection.createStatement().executeQuery("select * from studentaffairs.studentsdata where nationalid = \""+nationalId+"\";");
                 System.out.println("Resultset Setted successFully From Database");
                 if(rs.next()){
                 gpaControllerObj.studentNameInPublic=rs.getString("name");
                 System.out.println(rs.getString("name"));
                 LoginGpa.getScene().getWindow().hide();
                 Parent root = FXMLLoader.load(getClass().getResource("/frontend/Gpa.fxml"));
                 Stage gpa = new Stage();
                 Scene s2 = new Scene(root);
                 gpa.setTitle("Main");
                 gpa.setScene(s2);
                 gpa.show();
                    }
                else{
                JOptionPane.showMessageDialog(null,"This student isn't exist in Database !!");
            }
           }catch(Exception e){
               System.out.println("Error done in Result Set in Login GPA");
           }
        }catch(Exception e){
            System.out.println("Error done in Login jpa page ");
        }
        

    }
}
