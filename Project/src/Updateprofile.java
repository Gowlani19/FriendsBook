import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding.Use;
public class Updateprofile {
	//User user=new User();
	
	
	public void UpdateProfile(){}

	
	public static void update(String userId) {
		
		
		Scanner input2 = new Scanner(System.in);
        String Selection = "";
        while(!Selection.equals("z")) {
	 	//take input form user
		 	System.out.println(" 1: to update password");
		 	System.out.println(" 2: to update firstname");
		 	System.out.println(" 3: to update lastname");
		 	System.out.println(" 4: to update birthday");
		 	System.out.println(" 5: to logout");
		 	int selection = input2.nextInt();
		 	
		 	if(selection == 1) {
		 		System.out.println("Please enter the new password");
		 		String pwd = input2.next();
		 		updatePwd(userId, pwd);
		 	}
		 	else if(selection == 2) {
		 		System.out.println("Please enter the new firstname");
		 		String fname = input2.next();
		 		updateFname(userId, fname);
		 	}
		 	else if(selection == 3) {
		 		System.out.println("Please enter the new lastname");
		 		String lname = input2.next();
		 		updateLname(userId, lname);
		 	}
		 	else if(selection == 4) {
		 		System.out.println("Please enter the new birthday");
		 		String birthday = input2.next();
		 		updateBday(userId, birthday);
		 	}
		 	else {
		 		;
		 	}
		
		
        }
	}
	
	private static void updatePwd(String userId, String pwd) {	
		//database operation
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
	         
	         st.executeUpdate("Update Register set Password ='"+pwd+"' where Rid = '"+userId+"'");
	        		 
	     }
	     catch(SQLException e)
	 	 {
	 		 e.printStackTrace();//this is important to put in catch statment
	 	 }
	     finally {
	    	 try
             {
                 conn.close();
                 st.close();
                 
             }
             catch(Exception e)
 		     {
                 e.printStackTrace();
             }
	     }
	}
	
	//method for updating firstname
	private static void updateFname(String userId, String fname) {	
		//database operation
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
	         
	         st.executeUpdate("Update Register set Firstname ='"+fname+"' where Rid = '"+userId+"'");
	        		 
	     }
	     catch(SQLException e)
	 	 {
	 		 e.printStackTrace();//this is important to put in catch statment
	 	 }
	     finally {
	    	 try
             {
                 conn.close();
                 st.close();
                 
             }
             catch(Exception e)
 		     {
                 e.printStackTrace();
             }
	     }
	}
	private static void updateLname(String userId, String lname) {	
		//database operation
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
	         
	         st.executeUpdate("Update Register set Lastname ='"+lname+"' where Rid = '"+userId+"'");
	        		 
	     }
	     catch(SQLException e)
	 	 {
	 		 e.printStackTrace();//this is important to put in catch statment
	 	 }
	     finally {
	    	 try
             {
                 conn.close();
                 st.close();
                 
             }
             catch(Exception e)
 		     {
                 e.printStackTrace();
             }
	     }
	}
	private static void updateBday(String userId, String birthday) {	
		//database operation
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
	         
	         st.executeUpdate("Update Register set Birthday ='"+birthday+"' where Rid = '"+userId+"'");
	        		 
	     }
	     catch(SQLException e)
	 	 {
	 		 e.printStackTrace();//this is important to put in catch statement
	 	 }
	     finally {
	    	 try
             {
                 conn.close();
                 st.close();
                 
             }
             catch(Exception e)
 		     {
                 e.printStackTrace();
             }
	     }
	}

}