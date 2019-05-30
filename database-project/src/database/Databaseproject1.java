package database;

import java.sql.*;

public class Databaseproject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  //Get connection to sql database
        	  Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","mikefarwell");
        	  //Create a statement
        	  Statement myStmt = myCon.createStatement();
        	  //Exceute Sql Query
        	  ResultSet myrm = myStmt.executeQuery("SELECT * FROM students");
        	  //Process the result set
        	  while(myrm.next()) {
        		  System.out.println(myrm.getString("id")+" "+myrm.getString("firstname")+" "+myrm.getString("lastname"));
        	  }
          }
          catch(Exception exc) {
        	  exc.printStackTrace();
          }
	}
}
