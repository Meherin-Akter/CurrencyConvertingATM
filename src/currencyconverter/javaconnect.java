
package currencyconverter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn=null; //At first put null on the variable
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC"); //This line is a command to connect Sqlite Database with Java
            Connection conn = DriverManager.getConnection("jdbc:sqlite:DataBase\\pinREG.sqlite"); //We put the database in this direction
            return conn; //return the connection result to use in other pages
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}
