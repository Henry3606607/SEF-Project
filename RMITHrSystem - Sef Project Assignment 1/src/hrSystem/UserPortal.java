package hrSystem;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserPortal extends Login{
	
	public static void printMenu(User user) {
		System.out.println("Hello "+user.getFirstName());
		System.out.println("What would you like to do?");
		System.out.println("1 : Create a Task?");
		System.out.println("3 : Logout");
		if(user.userType == "admin") {
			System.out.println("5 : Create new User?");
			System.out.println("6 : Remove User");
		}
	}
	
	public static void mainMenu(User user){

		Scanner scan = new Scanner(System.in);
		int userCommand;
		//UserPortal is not specific for user type. This will be applied later in development
		while(user != null) {
			printMenu(user);
			userCommand = scan.nextInt();
			if(userCommand == 1) {
				Task task = new Task(null, null, null, "empty", "empty", 0);
				task.createTask(user);
			}
			else if(userCommand == 3) {
				user = null;
				System.out.println("Succesfully logged out");
			}
			else if(user.userType == "admin" && userCommand == 5) {
				if(Admin.addStaff()) {
					
				}
			}
			else if(user.userType == "admin" && userCommand == 6) {
				try {
					Admin.removeStaff();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Command not recognized, try again");
			}
		}
	}
}