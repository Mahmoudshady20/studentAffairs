
package dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

public class UserDao {
    private Connection connection = null;
    private String sql = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultset = null;
    public UserDao(){
    
}

    public int register(User user){
        connection = DatabaseConnection.connect();
        sql = "SELECT * FROM log_in WHERE nationalid = ? and name = ? and email = ? and number = ? and course1 = ? +"
            + "and course2 = ? and course2 = ? and course3 = ? and course4 = ? and course5 = ? and course6 = ?+"
            + "and grade1 = ? and grade2 = ? and grade3 = ? and grade4 = ? and grade5 = ? and grade6 = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getNationalid());
            preparedStatement.setString(2,user.getName());
            preparedStatement.setString(3,user.getEmail());
            preparedStatement.setString(4,user.getNumber());
            preparedStatement.setString(5,user.getCourse1());
            preparedStatement.setString(6,user.getCourse2());
            preparedStatement.setString(7,user.getCourse3());
            preparedStatement.setString(8,user.getCourse4()); 
            preparedStatement.setString(9,user.getCourse5());
            preparedStatement.setString(10,user.getCourse6());
            preparedStatement.setDouble(11,user.getGrade1());
            preparedStatement.setDouble(12,user.getGrade2());
            preparedStatement.setDouble(13,user.getGrade3());
            preparedStatement.setDouble(14,user.getGrade4());
            preparedStatement.setDouble(15,user.getGrade5());
            preparedStatement.setDouble(16,user.getGrade6());
            resultset = preparedStatement.executeQuery();
            resultset.next();
            if(resultset.next()){
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
