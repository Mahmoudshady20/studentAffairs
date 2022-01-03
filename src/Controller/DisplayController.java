
package Controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import studentaffers.Database;

/**
 *
 * @author pc
 */
public class DisplayController {
    
     @FXML
    private TableColumn<modeltable, String> course4;

    @FXML
    private Button buttonsearch;

    @FXML
    private TableColumn<modeltable, String> course3;

    @FXML
    private TableColumn<modeltable, String> course6;

    @FXML
    private TableColumn<modeltable, String> course5;

    @FXML
    private TableColumn<modeltable, String> level;


    @FXML
    private AnchorPane DisplayWindow;


    @FXML
    private TableView<modeltable> tabel;


    @FXML
    private TableColumn<modeltable, String> course2;

    @FXML
    private TableColumn<modeltable, String> course1;

    @FXML
    private TableColumn<modeltable, String> nationalid;

    @FXML
    private TextField nationalIdForsearch;

    @FXML
    private TableColumn<modeltable, String> phone;

    @FXML
    private TableColumn<modeltable, String> name;

    @FXML
    private TableColumn<modeltable, String> department;

    @FXML
    private TableColumn<modeltable, String> email;
       ObservableList<modeltable> oblist = FXCollections.observableArrayList();
    Connection connection;
    @FXML
            public void displayStudents()
            {
            //    tabel.getItems().clear(); // remove every thing inside the table ..
                
              try{
                    connection= new Database().connectWithDataBase();
                    System.out.println("Connect with database to Show students Done ## ");
                      ResultSet rs=connection.createStatement().executeQuery("select * from studentaffairs.studentsdata");
                      System.out.println("ResultSet To show students Working successfully ##");
                      while(rs.next()){
                           oblist.add(new modeltable(rs.getString("name"),rs.getString("nationalid"),rs.getString("email"),rs.getString("phonenumber"),rs.getString("level"),rs.getString("department"),rs.getString("course1"),rs.getString("course2"),rs.getString("course3"),rs.getString("course4"),rs.getString("course5"),rs.getString("course6")));
           
                      }
                      connection.close();
              }catch(Exception e){
                  System.out.println("Error while Displaying data from database !!");
              }
           name.setCellValueFactory(new PropertyValueFactory<>("name"));
           nationalid.setCellValueFactory(new PropertyValueFactory<>("nationalid"));
            email.setCellValueFactory(new PropertyValueFactory<>("email"));
            phone.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
            level.setCellValueFactory(new PropertyValueFactory<>("level"));
        department.setCellValueFactory(new PropertyValueFactory<>("department"));
       
        
        course1.setCellValueFactory(new PropertyValueFactory<>("course1"));
        course2.setCellValueFactory(new PropertyValueFactory<>("course2"));
        course3.setCellValueFactory(new PropertyValueFactory<>("course3"));
        course4.setCellValueFactory(new PropertyValueFactory<>("course4"));
        course5.setCellValueFactory(new PropertyValueFactory<>("course5"));
        course6.setCellValueFactory(new PropertyValueFactory<>("course6"));
       
        tabel.setItems(oblist);
            }
        private String url="jdbc:mysql://localhost:3325/studentaffairs.studentsdata";
        private String ResourceBundle="resources";
        public void initialize(URL location, ResourceBundle resources) {
         try{
                    connection= new Database().connectWithDataBase();
                    System.out.println("Connect with database to Show students Done ## ");
                      ResultSet rs=connection.createStatement().executeQuery("select * from studentaffairs.studentsdata");
                      System.out.println("ResultSet To show students Working successfully ##");
                      while(rs.next()){
                           oblist.add(new modeltable(rs.getString("name"),rs.getString("nationalid"),rs.getString("email"),rs.getString("phonenumber"),rs.getString("level"),rs.getString("department"),rs.getString("course1"),rs.getString("course2"),rs.getString("course3"),rs.getString("course4"),rs.getString("course5"),rs.getString("course6")));
           
                      }
                      connection.close();
              }catch(Exception e){
                  System.out.println("Error while Displaying data from database !!");
              }
           name.setCellValueFactory(new PropertyValueFactory<>("name"));
           nationalid.setCellValueFactory(new PropertyValueFactory<>("nationalid"));
            email.setCellValueFactory(new PropertyValueFactory<>("email"));
            phone.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
            level.setCellValueFactory(new PropertyValueFactory<>("level"));
        department.setCellValueFactory(new PropertyValueFactory<>("department"));
       
        
        course1.setCellValueFactory(new PropertyValueFactory<>("course1"));
        course2.setCellValueFactory(new PropertyValueFactory<>("course2"));
        course3.setCellValueFactory(new PropertyValueFactory<>("course3"));
        course4.setCellValueFactory(new PropertyValueFactory<>("course4"));
        course5.setCellValueFactory(new PropertyValueFactory<>("course5"));
        course6.setCellValueFactory(new PropertyValueFactory<>("course6"));
       
        tabel.setItems(oblist);
         }
    
  

     @FXML
    void mainwindow(ActionEvent event) throws IOException {
        DisplayWindow.getScene().getWindow().hide();
        Parent coursew;
        coursew = FXMLLoader.load(getClass().getResource("/frontend/Main.fxml"));
        Stage register = new Stage();
        Scene s3 = new Scene(coursew);
        register.setTitle("Main");
        register.setScene(s3);
        register.show();
    }
}
