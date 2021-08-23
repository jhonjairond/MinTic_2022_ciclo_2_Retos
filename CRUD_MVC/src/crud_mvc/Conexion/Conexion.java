/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud_Mvc.Conexion;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/
import java.sql.*;
import java.util.*;
import javax.swing.*;


/**
 *
 * @author P117
 */
public class Conexion {
    public Connection GetConnection()
    {            
        Connection conexion=null;
       try
        {
            //Class.forName("oracle.jdbc.OracleDriver");
            Class.forName("com.mysql.cj.jdbc.Driver");
          //      String servidor = "jdbc:mysql://localhost:9090/upb_prueba?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String servidor = "jdbc:mysql://localhost:3307/db.java.clases";
          // String servidor = "jdbc:oracle:thin:@localhost:1521:XE";
            String user="root";
            String passwordDB="root";
            conexion= DriverManager.getConnection(servidor,user,passwordDB);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        finally
        {
           // JOptionPane.showMessageDialog(null,"conecto");           
            return conexion;
        }
        
        
    }
    
  
}
