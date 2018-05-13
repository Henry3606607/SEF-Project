package hrSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
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
		String userCommand = null;
		//UserPortal is not specific for user type. This will be applied later in development
		while(user != null) {
			printMenu(user);
			userCommand = scan.nextLine();


			if(userCommand.equals("1")) {
				Task task = new Task(null, null, null, "empty", "empty", 0);
				task.createTask(user);
			}
			else if(userCommand.equals("3")) {
				user = null;
				System.out.println("Succesfully logged out");
			}
			else if(user.userType == "admin" && userCommand.equals("5")) {
				if(Admin.addStaff()) {
					
				}
			}
			else if(user.userType == "admin" && userCommand.equals("6")) {
					Admin.removeStaff();
			}
			else {
				System.out.println("Command not recognized, try again");
			}
		}
		scan.close();
	}
}