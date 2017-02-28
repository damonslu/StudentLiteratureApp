// Md. Zubayer Alam: Created this class and wrote main function.
// Added variable to dbconnection. Makes it easier to change databaseinfo. //Ibtissam 2013-12-16
// Changed database-model, so we can know who has put up which book for sale //Ibtissam 2013-12-27
// Added variable for logged in userid //Ibtissam 2013-12-28
// Figured out application failures I have them in stored files during testing over and over and corrected them that actually all works. // Ibtissam 

import java.sql.*;

public class MainClass {
    protected static String user;
    protected static String pass;
    protected static SearchResult searchResult;
    protected static String dbconnection;
    

   
    public static void main(String[]args) throws SQLException{
        dbconnection = "jdbc:mysql://127.0.0.1:3306/dtb";
        user = "root";
        pass = "bitch";
        
        searchResult = new SearchResult();
        searchResult.setVisible(true);
        searchResult.setLocationRelativeTo(null);
        try{  
            Class.forName("com.mysql.jdbc.Driver");      
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
