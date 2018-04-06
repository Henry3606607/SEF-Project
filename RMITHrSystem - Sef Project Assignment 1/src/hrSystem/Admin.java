package hrSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin extends User {

	Scanner scan = new Scanner(System.in);
	//Task tasks = new Task();
	//int numTasks = 0;
	String id;
	double d;
	boolean doubleEntered = false;
	

	public Admin(String id) {
		this.setRmitId(id);
	}
	





	/*public void createTask() {
		System.out.print("Please enter the task's name: ");
		i = scan.nextLine();
		tasks.setTaskName(i);
		System.out.print("Please enter the task's course: ");
		i = scan.nextLine();
		tasks.setCourse(i);
		System.out.print("Please enter the task's date and time: ");
		i = scan.nextLine();
		tasks.setDateTime(i);
		do {
			try {
				System.out.print("Please enter the Task's pay rate: ");
				d = scan.nextDouble();
				doubleEntered = true;
			}catch (InputMismatchException e){
				System.out.println("Please enter a decimal number i.e '21.45': ");
				doubleEntered = false;
			}
			scan.nextLine();
		}while (doubleEntered == false);
		
		tasks.setPayRate(d);
		
		System.out.print("Task: " + tasks.getTaskName() + 
				"\nCourse: " + tasks.getCourse() + 
				"\nDate and Time: " + tasks.getDateTime() + 
				"\nPay Rate: " + tasks.getPayRate());
	}*/
}
