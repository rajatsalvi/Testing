package database;
import java.sql.*;
public class DatabaseDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String url="jdbc:mysql://localhost:3306/studentdetails";
       String user="root";
       String password="mikefarwell";
       
       try {
    	   //Get connection
    	   Connection myCon = DriverManager.getConnection(url,user,password);
    	   //Create Statement
    	   Statement myStmt = myCon.createStatement();
    	   //Exceute the sql query
    	   String sql ="delete from students"
    			   +" where lastname ='Joy' ";
    	   
    	   int rowAffected = myStmt.executeUpdate(sql);
    	   System.out.println("deleted row :  "+rowAffected);
    	   System.out.println("Deleted Successfully");
       }
       catch(Exception exc) {
    	   exc.printStackTrace();
       }
	}

}
