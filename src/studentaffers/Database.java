/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentaffers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author pc
 */
public class Database {
    Connection connection;
    String user="root";
    String password="";
    String host="jdbc:mysql://localhost:3325/studentaffairs";
    
  public  Database(){
      try{
          System.out.println("Database class Accessed");
            connection=DriverManager.getConnection(host,user,password); // it always throw exception
                 System.out.println("Connection Done #");
                 String sqlCommand=      "create table studentaffairs.studentsdata(name Text,"
                         + "nationalid text"
                         + ",email text,"
                         + "phonenumber text,"
                         + "level text"
                         + ",department text,"
                         + "course1 text"
                         + ",grade1 text"
                         + ",course2 text"
                         + ",grade2 text,"
                         + "course3 text,"
                         + "grade3 text, "
                         + "course4 text,"
                         + "grade4 text,"
                         + "course5 text"
                         + ",grade5 text,"
                         + "course6 text,"
                         + "grade6 text"
                         +" CONSTRAINT PK1 PRIMARY KEY (nationalid)" 
                         + ");" ;       
          Statement stmt=connection.createStatement();
          stmt.execute(sqlCommand);
          System.out.println("Table Created Successfully #");
          connection.close();
      }catch(Exception e){
          System.out.println("");
      }
   }
  public Connection connectWithDataBase() throws  Exception{
          Connection con=DriverManager.getConnection(host,user,password); // it always throw exception
return con;
  }
}
