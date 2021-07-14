package cms;
import java.sql.*;
class DB_Connectivity 
{
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
            con = DriverManager.getConnection(url,"SYS","123");
            System.out.println("Successfully Connected to the database.");
             
         }
         catch(SQLException e)
         {
            System.out.println("Could not connect "+ e.getMessage());
         }
    return con;
    } 
} 
