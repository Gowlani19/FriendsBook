import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateFriendRequest {
	
	public static void CreateRequest(String userId) {
		//create a var for receiver Id
		String RecId="";
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the id to whom you want to send friend request:");
		RecId=input2.next();
		//System.out.println(userId);
		if(userId.equals(RecId)) 
		{
			System.out.println("id is same as yours");
		}
		else 
		{
			System.out.println("id is not same as yours ");
			final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/gowlania3982"; 
		     // connection,statement
		     Connection conn = null;
		     Statement st = null;
		     ResultSet rs = null;
		     try
		     {
		         conn = DriverManager.getConnection(DB_URL,"gowlania3982", "1763683");
		         //create a statement
		         st = conn.createStatement();
		         rs = st.executeQuery("Select * from register where Rid = '" + RecId +"'");
		        
		         if(rs.next()) {
		         if(RecId.equals(rs.getString("Rid")))
		         {
		        	 
		        	 System.out.println("Found in register table");
		        	 
		
		         }
		         else {
		        	 System.out.println("Not Found in register table");
		         }
		         CreateFriendRequest.Notification(userId, RecId);
		        // String fname = rs.getString(2);
		        // System.out.println(fname);
		         }
		       //  Scanner input3 = new Scanner(System.in);
		         //String Selection="";
		        /* while(!Selection.equals("x")) {
		        	 System.out.println("1:Send friend request");
		        	 System.out.println("2:Send Message");
		        	 int selection = input2.nextInt();
		        	 if(selection==1) {
		        		 
		        	 }
		         }*/
		         
		     }
		     catch(SQLException e)
		 	 {
		 		 e.printStackTrace();//this is important to put in catch statement
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

		     
		}
		
		
	    
}
	public static void Notification(String userId, String RecId) {
		String Sno="";
		 String Sender=userId;
		 String Receiver=RecId;
		 String Message="";
		 String Type="Request";
		boolean Status=false;
		 Scanner input = new Scanner(System.in);
		 //DB connection
		 final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/gowlania3982"; 
	     // connection,statement
	     Connection conn = null;
	     Statement st = null;
	     ResultSet rs = null;
	     try
	     {
	         conn = DriverManager.getConnection(DB_URL,"gowlania3982", "1763683");
	         //create a statement
	         st = conn.createStatement();
	         rs= st.executeQuery("select * from Notification");
	         int nextnum =0;
	         int r = st.executeUpdate(" Insert into Notification values('" + Sno
		             + "', '" +Sender + "','" + Receiver+ "','" +Message + "', '" + Type+ "','"+1+ "')");
	}
	 
	     catch(SQLException e)
	     {
	       e.printStackTrace();//this is important to put in catch statment
	     }
	     finally
	     {
	             //close db this is inside try catch when the database is null
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
}
	public static void AcceptRequest() {
		 final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/gowlania3982"; 
	     // connection,statement
	     Connection conn = null;
	     Statement st = null;
	     ResultSet rs = null;
	     try
	     {
	         conn = DriverManager.getConnection(DB_URL,"gowlania3982", "1763683");
	         //create a statement
	         st = conn.createStatement();
	     }
	         catch(SQLException e)
		     {
		       e.printStackTrace();//this is important to put in catch statment
		     }
		     finally
		     {
		             //close db this is inside try catch when the database is null
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
	}
}

