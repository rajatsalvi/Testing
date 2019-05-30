package database;
import java.sql.*;
public class DatabaseUpdate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		String url ="jdbc:mysql://localhost:3306/studentdetails";
		String user ="root";
		String password="mikefarwell";
		
	try {
		//Get connection to database
	   Connection myCon = DriverManager.getConnection(url,user,password);	
	    //Create Statement 
	   Statement myStmt = myCon.createStatement();
	   //Exceute the sql query
	   String sql = "INSERT INTO students"
	   + "(id,firstname,lastname,contactno,address,pincode,class,age,marks)"
			   +"VALUES(6,'Siddhi','ZZ',616516132132,'Virzxwest near VIVA',404646,17,25,98)";
	
	   myStmt.executeUpdate(sql);
	   System.out.println("Insert Complete");
	   //Excute the sql query
	   ResultSet myrm = myStmt.executeQuery("SELECT * FROM students where id=6");
	   
	   while(myrm.next()) {
		   System.out.println(myrm.getString("id")+" "+myrm.getString("firstname")+" "+myrm.getString("lastname"));
	   }
	   
	}
	catch(Exception exc) {
		exc.printStackTrace();
	}

}
}