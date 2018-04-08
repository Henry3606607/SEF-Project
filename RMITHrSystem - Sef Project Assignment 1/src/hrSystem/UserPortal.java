package hrSystem;

import java.util.Scanner;

public class UserPortal extends Login{
	
	public static void mainMenu(User user){
		Scanner scan = new Scanner(System.in);
		int userCommand;
		while(user != null) {
			System.out.println("Hello "+user.getFirstName());
			System.out.println("What would you like to do?");
			System.out.println("1 : Create a Task?");
			System.out.println("");
			System.out.println("3 : Log Out");
			
			userCommand = scan.nextInt();
			if(userCommand == 1) {
				//run create task function
			}
			if(userCommand == 3) {
				user = null;
				System.out.println("Succesfully logged out");
			}
		}
	}
}
