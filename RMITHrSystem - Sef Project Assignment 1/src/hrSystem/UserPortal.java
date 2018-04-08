package hrSystem;

import java.util.Scanner;

public class UserPortal extends Login{
	
	public static void mainMenu(User user){

		Scanner scan = new Scanner(System.in);
		int userCommand;
		//UserPortal is not specific for user type. This will be applied later in development
		System.out.println("Hello "+user.getFirstName());
		System.out.println("What would you like to do?");
		System.out.println("1 : Create a Task?");
		System.out.println("3 : Logout");
		
		while(user != null) {
			userCommand = scan.nextInt();
			if(userCommand == 1) {
				Task task = new Task(null, null, null, "empty", "empty", 0);
				task.createTask(user);
			}
			else if(userCommand == 3) {
				user = null;
				System.out.println("Succesfully logged out");
			}
		}
	}
}