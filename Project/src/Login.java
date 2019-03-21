import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	public   static String Login()
	 {
	 	//Create new parameter
	 	
	 	String ID ="";
	 	String password = "";
	 	
	 	Scanner input = new Scanner(System.in);
	 	//take input form user
	 	System.out.println("Please enter ID");
	 	ID = input.nextLine();
	 	System.out.println("Please enter password");
	 	
	 	password = input.nextLine();
//connect with the database
	 	
	 	final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/gowlania3982";
	 	
	 	//// connection,statement
	 	 Connection conn = null;
	 	 //checking id
	 	 Statement st = null;
	 	 //check pwd
	 	 Statement pwCheck= null;
	 	 ResultSet rs = null;
	 	 ResultSet pwdCheck=null;
	 	// String Query = "select AccountID" + "from" + gowlania3982 + ".register";
	 	 try
	 	 {
	 		 conn = DriverManager.getConnection(DB_URL,"gowlania3982","1763683");
	 		 //create a statement
	 		 st = conn.createStatement();
	 		 pwCheck= conn.createStatement();
	 		 String s = "login succesfull";
	 		//to get the accountID
	 		// System.out.println(rs);
	 		 rs = st.executeQuery("Select * from register " + "where Rid = '" + ID +"'");
	 		 //if next row not null go ahead
	 		 //checking id
	 		if(rs.next())
	 		 {
	 			//validation 
	 			pwdCheck=pwCheck.executeQuery("Select * from register " + "where Rid = '" + ID +"' and Password = '"+ password +"'");
	 			if(pwdCheck.next())
	 				 System.out.println( "You are logged in");
	 			
	 	        
	 			else
	 				System.out.println("Wrong password");
	 		 }
	 		else
	 		 {
				System.out.println("User doesnt exist");
	 		 }
	 		
		   		 
		 		 
	 	 }
	 	 catch(SQLException e)
	 	 {
	 		 e.printStackTrace();//this is important to put in catch statment
	 	 }
	 	 finally
	 	 {
	 		 try
	             {
	                 conn.close();
	                 st.close();
	                 rs.close();
	             }
	             catch(Exception e)
	 		     {
	                 e.printStackTrace();
	             }
         }

		 


			 
	
	
	return ID;
	
}
	



	 		 
	 	 


}
