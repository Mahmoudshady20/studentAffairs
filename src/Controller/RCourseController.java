
package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import studentaffers.Database;

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
        String course1="";
        String course2="";
        String course3="";
        String course4="";
        String course5="";
        String course6="";
       Connection connection;
        @FXML
   void okAction(ActionEvent event) throws IOException {
       RegisterController obj=new RegisterController();
       course1=course1TextField.getText();
       course2=course2TextField.getText();
       course3=course3TextField.getText();
       course4=course4TextField.getText();
       course5=course5TextField.getText();
       course6=course6TextField.getText();

      try{
           connection =new Database().connectWithDataBase();
         try{
              String sqlCommand="insert into studentaffairs.studentsdata(name,nationalid,email,phonenumber,level,department,course1,course2,course3,course4,course5,course6) values ( \""+RegisterController.studentName+"\","
                  +  "\""+RegisterController.nationalId+"\","+
                    "\""+RegisterController.studentEmail+"\","+
                    "\""+RegisterController.phoneNumber+"\","+
                    "\""+RegisterController.studentLevel+"\","+
                    "\""+RegisterController.studentDepartment+"\","+
                    "\""+course1+"\","+
                    "\""+course2+"\","+
                    "\""+course3+"\","+
                    "\""+course4+"\","+
                    "\""+course5+"\","+
                    "\""+course6+"\""+
                   ");";
              System.out.println(sqlCommand);
           Statement stmt=connection.createStatement();
           stmt.execute(sqlCommand);
           System.out.println("Student inserted into Database ##") ;
           RegisterController.studentName=null;
           RegisterController.nationalId=null;
           RegisterController.studentEmail=null;
           RegisterController.phoneNumber=null;
           RegisterController.studentLevel=null;
           RegisterController.studentDepartment=null;
         }catch(Exception e){
             System.out.println("Erro while inserting data into database !!");
         }
      }catch(Exception e){
          System.out.println("Error in insert page Database");
      }
              
       registercoursewindow.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/frontend/Main.fxml"));
        Stage gpa = new Stage();
        Scene s2 = new Scene(root);
        gpa.setTitle("Main");
        gpa.setScene(s2);
        gpa.show();
    }
}
