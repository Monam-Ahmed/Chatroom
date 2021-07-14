
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suqlain Sher
 */
public class DB {
    public static Connection con = null;
    
    public Connection connectDB() 
    { 
         try
         {
            String driverName = "oracle.jdbc.driver.OracleDriver";
            String serverName ="localhost";
            String serverPort = "1521";
            String sid = "ORCL";
            String url = "jdbc:oracle:thin:@"+serverName + ":" + serverPort + ":"+ sid;
            con = DriverManager.getConnection(url,"SYSTEM","725554");
            System.out.println("Successfully Connected to the database.");
             
         }
         catch(SQLException e)
         {
            System.out.println("Could not connect "+ e.getMessage());
         }
    return con;
    } 
}
