/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Muhtar
 */
public class JavaConnect {
    Connection connection;
    
    public static Connection connectDB() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_crud","root","");
            return connection;
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
    }
    
}
