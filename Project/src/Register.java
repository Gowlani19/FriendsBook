import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Scanner;
//create a class called register
public class Register {
	//
public static void createregaccount() {
	
//declare attributes 
	String Rid="";
 String Firstname="";
	 String Lastname="";
	 
	 String Gender="";
	 String Education="";
	 String Birthday="";
	 String Password="";
	//String answer="";
	 
     
System.out.println("Connecting to DB");
//database operation
     final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/gowlania3982"; 
     // connection,statement
     Connection conn = null;
     Statement st = null;
     ResultSet rs = null;
     try
     {
    	 System.out.println("Connected to DB");
    	 Scanner input = new Scanner(System.in);
    	    User user=new User();
    	     System.out.println("Please enter the Rid :");
    	     
    	    do 
    	    { Rid= input.next();
    	     if(Rid.length()<3|| Rid.length()>10) {
    	    	 System.out.println("Please enter id between 3-10 characters at least 1 letter,1 digits & one special(#,?,!,*:");
    	    	 Rid= input.next();
    	    	
    	     }
    	     
    	     //int s=st.executeQuery("select * from tableName where Rid" = +Rid);
    	    }while(Rid.length()<3|| Rid.length()>10);
    	     
    	    	// Scanner input1 = new Scanner(System.in);
    	     System.out.println("Please enter the Firstname:");
    	     Firstname= input.next();

    	     System.out.println("Please enter the Lastname:");
    	     Lastname= input.next();

    	    
    	     System.out.println("Please enter the Gender:");
    	     Gender= input.next();
    	     
    	     System.out.println("Please enter the Education:");
    	     Education= input.next();
    	     
    	     System.out.println("Please enter the Birthday:");
    	     Birthday= input.next();
    	     
    	     System.out.println("Please enter the Password:");
    	     Password= input.next();
    	     while(Password.equals(Rid)){
    	    	 System.out.println("Password Cannot be same as ID");
    	    	 System.out.println("Please enter the Password");
    	    	 Password = input.next();
    	     
    	     }

         conn = DriverManager.getConnection(DB_URL,"gowlania3982", "1763683");
         //create a statement
         st = conn.createStatement();
         String s =  "Account opened with" +Rid;
         rs= st.executeQuery("select * from register");
         int nextnum =0;
		 
		 //insert a record into register table
         int r = st.executeUpdate(" Insert into register values('" + Rid
	             + "', '" + Firstname + "','" + Lastname + "','" + Gender + "', '" + Education + "','"+Birthday+ "','" + Password+ " ')");
		 

     }
     
     catch(SQLException e)
     {
    	 System.out.println("unable to connect");
       e.printStackTrace();//this is important to put in catch statment
     }
     finally
     {
    	 System.out.println("Closing DB connection");
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

