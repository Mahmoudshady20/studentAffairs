
package Controllerdb;

import Services_implimentation.StudentInformationim;
import model.User;

public class UserController {
    
    private StudentInformationim studentinformationim;

    public UserController() {
      studentinformationim = new  StudentInformationim();
    }
    
    public int studentname(User user){
       return studentinformationim.StudentName(user);
    }
}
