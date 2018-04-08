package hrSystem;

import java.util.Scanner;

public class UserPortal extends Login{
	
	public static void mainMenu(User user){

		Scanner scan = new Scanner(System.in);
		int userCommand;

		System.out.println("Hello "+user.getFirstName());
		System.out.println("What would you like to do?");
		System.out.println("1 : Create a Task?");
		System.out.println("3 : Logout");
		scan.nextInt();
		userCommand = scan.nextInt();
		
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