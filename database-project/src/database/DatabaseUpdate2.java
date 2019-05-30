package database;
import java.sql.*;
public class DatabaseUpdate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String url="jdbc:mysql://localhost:3306/studentdetails";
     String user="root";
     String password="mikefarwell";
     
     try {
    	 //Get connection to mysql database
    	 Connection myCon = DriverManager.getConnection(url,user,password);
    	 //Create a statement object
    	 Statement myStmt = myCon.createStatement();
    	 //Exceute the sql query
    	 String sql ="update students"
    			 +" set firstname='Akshay' "
    			 +"where id=3";
    	 myStmt.executeUpdate(sql);
    	 System.out.println("Update Complete");
    	 
     }
     catch(Exception exc) {
    	 exc.printStackTrace();
     }
	}

}
