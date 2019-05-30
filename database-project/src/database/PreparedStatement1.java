package database;
import java.sql.*;
public class PreparedStatement1  {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
  String url="jdbc:mysql://localhost:3306/studentdetails";
  String user="root";
  String password="mikefarwell";
  ResultSet myRm=null;
  
  try {
	  //Get the connection to SQL Database
	  Connection myCon = DriverManager.getConnection(url,user,password);
	  
	  PreparedStatement myStmt = myCon.prepareStatement("update students set lastname = ? where id = ?");
	  
	  myStmt.setString(1,"Josephs");
	  myStmt.setDouble(2, 6);
	  myStmt.executeUpdate();
	  
	  System.out.println("Updated successfully");
	  
  }
  catch(Exception exc) {
	  exc.printStackTrace();
  }
	}

}
