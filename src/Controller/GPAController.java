package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;

public class GPAController {

   
       
    
    
    
   @FXML
    private TextField grade6;

    @FXML
    private TextField grade5;

    @FXML
    private TextField grade4;

    @FXML
    private TextField grade3;
    
    @FXML
    private TextField grade2;

    @FXML
    private TextField grade1;  

    @FXML
    private  TextField course2TextField;

    @FXML
    private TextField course5TextField;

    @FXML
    static TextField studentNameTextField;

    @FXML
    private TextField course6TextField;

    @FXML
    private TextField course3TextField;

    @FXML
    private TextField course1TextField;

    @FXML
    private GridPane gpawindow;

    @FXML
    private TextField course4TextField;
    
   
    
     public static String studentNameInPublic;
    public static String course1InPublic;
    public static String course2InPublic;
        public static String course3InPublic;
            public static String course4InPublic;
                public static String course5InPublic;
         public static String course6InPublic;
    
       
    
    
    @FXML
    void calculategpa(ActionEvent event) {
        gpawindow.getScene().getWindow().hide();
       int g1 = Integer.parseInt(grade1.getText());
       int g2 = Integer.parseInt(grade2.getText());
       int g3 = Integer.parseInt(grade3.getText());
       int g4 = Integer.parseInt(grade4.getText());
       int g5 = Integer.parseInt(grade5.getText());
       int g6 = Integer.parseInt(grade6.getText());

        double gpa = 0.0;
        int [] arr = new int[] {g1,g2,g3,g4,g5,g6};
    for(int i=0;i<6;i++){
       if(arr[i]<50){
          gpa+=0; 
       } 
       if(arr[i]>=50 && arr[i]<60){
          gpa+=2; 
       }
       if(arr[i]>=60 && arr[i]<65){
          gpa+=2.2; 
       }
       if(arr[i]>=65 && arr[i]<70){
          gpa+=2.4; 
       }
       if(arr[i]>=70 && arr[i]<74){
          gpa+=2.7; 
       }
       if(arr[i]>=75 && arr[i]<79){
          gpa+=3.0; 
       }
       if(arr[i]>=80 && arr[i]<84){
          gpa+=3.3; 
       }
       if(arr[i]>=85 && arr[i]<89){
          gpa+=3.7; 
       }
       if(arr[i]>=90 && arr[i]<=100){
          gpa+=4.0; 
       }
    }
    JOptionPane.showMessageDialog(null,gpa/6);
    }    
}
