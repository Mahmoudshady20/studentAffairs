/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services_implimentation;

import Services.StudentInformation;
import dao.UserDao;
import model.User;
/**
 *
 * @author pc
 */
public class StudentInformationim implements StudentInformation {
    private UserDao userDao;

           
    public StudentInformationim() {
        this.userDao = userDao;
    }
    

    
    @Override
    public int StudentName(User use) {
       return userDao.register(use);
    }

    
}
