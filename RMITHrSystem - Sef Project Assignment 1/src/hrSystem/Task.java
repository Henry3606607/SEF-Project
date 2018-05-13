package hrSystem;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

import java.util.Scanner;


public class Task {
	private static BufferedReader fileReader =  null;
	Course course;
	TimeApprover assignedApprover;
	CasualStaff assignedStaffMember;
	String taskName;
	String date;
	String time;
	public double payRate;
	public boolean verified;
	public boolean completed;
	
	public Task(Course course, TimeApprover assignedApprover, CasualStaff assignedStaffMember, String taskName,
			String dateTime, double payRate) {
		this.course = course;
		this.assignedApprover = assignedApprover;
		this.assignedStaffMember = assignedStaffMember;
		this.taskName = taskName;
	}
	
	
	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public TimeApprover getAssignedApprover() {
		return assignedApprover;
	}
	public void setAssignedApprover(TimeApprover assignedApprover) {
		this.assignedApprover = assignedApprover;
	}
	public CasualStaff getAssignedStaffMember() {
		return assignedStaffMember;
	}
	public void setAssignedStaffMember(CasualStaff assignedStaffMember) {
		this.assignedStaffMember = assignedStaffMember;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskName() {
		return taskName;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	} 
	
	public boolean writeTaskToFile() {
		String line;
		String lastLine = null;
		String tokenized[];
		int currIndex;
		String content;
		
		FileWriter fw;
		try {
			fw = new FileWriter("src/tasks.csv", true);
		} catch (IOException e) {
			System.out.println("Error reading file");
			return false;
		}
		
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			bw.newLine();
			bw.write(taskName +",");
			bw.write(Double.toString(payRate)+",");
			bw.write(date+",");
			bw.write(time +",");
			if(completed) {
				bw.write("completed");
			}
			else {
				bw.write("notCompleted");
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Error writing to file");
			return false;
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	public void createTask(User user) {
		Scanner taskScanner = new Scanner(System.in);
		double d = 0;
		boolean doubleEntered = false;
		String userInput;
		System.out.print("Please enter the task's name: ");
		userInput = taskScanner.nextLine();
		setTaskName(userInput);
		//This function is to be added soon
		//System.out.print("Please enter the task's course: ");
		//i = scan.nextLine();
		//setCourse(NULL);
		System.out.print("Please enter the task's date (Monday, Tuesday etc.): ");
		
		setDate(taskScanner.nextLine());
		System.out.println("Please enter tasks time (830AM, 400PM etc.):");
		setTime(taskScanner.nextLine());
		do {
			try {
				System.out.print("Please enter the Task's pay rate: ");
				d = taskScanner.nextDouble();
				doubleEntered = true;
			}catch (InputMismatchException e){
				System.out.println("Please enter a decimal number i.e '21.45': ");
				doubleEntered = false;
			}
			taskScanner.nextLine();
		}while (doubleEntered == false);
		
		setPayRate(d);
		writeTaskToFile();
		System.out.print("Task Created by:" + user.getFirstName() +"\nTask: " + getTaskName() + 
				//This function is to be added soon
				//"\nCourse: " + getCourse() + 
				"\nDate: " + getDate() + 
				"\nTime: " + getTime() +
				"\nPay Rate: " + getPayRate());
		
		System.out.println("\nPress anybutton to return to menu");
		userInput = taskScanner.nextLine();
		UserPortal.mainMenu(user);
		
	}
	
}
