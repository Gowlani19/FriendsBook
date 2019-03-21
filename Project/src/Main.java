import java.util.Scanner;
public class Main {
	public static void main(String args[]) {

	Scanner input = new Scanner(System.in);
    String selection = "";
    while(!selection.equals("x"))
    {
        //menu of the online system
        System.out.println();
        System.out.println("Please make your selection");
        System.out.println("1: register account");
        System.out.println("2: login your online account");
        System.out.println("x: leave the system");
      //get the input
		//selection = input.nextLine();
        //get the selection
        selection = input.nextLine();
        if(selection.equals("1"))
        {
            Register.createregaccount();
        }
        
        
       else if(selection.equals("2"))
	{
	       String userId = Login.Login();
	       //once the user is logged in then we give user options to choose if he either wants to update profile or see his/her posgts
	       
	       Scanner input1 = new Scanner(System.in);
	        String Selection = "";
	        while(!Selection.equals("y")) {
	        	//menu of login system
	        	System.out.println("Please make your selection");
	            System.out.println("1. Select an update and post.");
	          
	            System.out.println("2. Create new post.");
	            System.out.println("3. See friends list.");
	            System.out.println("4. Update profile.");
	            System.out.println("5. Send a message.");
	            System.out.println("6. Send a friend request.");
	            System.out.println("7. See Hastag in trend.");
	            System.out.println("8. Check Notifications.");
	            System.out.println("y. Log out.");
	            selection = input.next();
	           // Updateprofile update=new Updateprofile();
if(selection.equals("4")) {
	//update.UpdateProfile();*/
	            Updateprofile.update(userId);

	        }
if(selection.equals("6")) {
	CreateFriendRequest.CreateRequest(userId);
	//CreateFriendRequest.Notification();
}
	
	
		}
	}
        
        else
        {
        	//go out
            ;
        }
    }    
	}
}


