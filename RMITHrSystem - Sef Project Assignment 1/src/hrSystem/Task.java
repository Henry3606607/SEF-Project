package hrSystem;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Task {
	Course course;
	TimeApprover assignedApprover;
	CasualStaff assignedStaffMember;
	String taskName;
	String dateTime;
	double payRate;
	boolean verified;
	boolean completed;
	
	public Task(Course course, TimeApprover assignedApprover, CasualStaff assignedStaffMember, String taskName,
			String dateTime, double payRate) {
		this.course = course;
		this.assignedApprover = assignedApprover;
		this.assignedStaffMember = assignedStaffMember;
		this.taskName = taskName;
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
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
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
	
	public void createTask() {
		Scanner scan = new Scanner(System.in);
		double d = 0;
		boolean doubleEntered = false;
		String i;
		System.out.print("Please enter the task's name: ");
		i = scan.nextLine();
		setTaskName(i);
		//This function is to be added soon
		//System.out.print("Please enter the task's course: ");
		//i = scan.nextLine();
		//setCourse(NULL);
		System.out.print("Please enter the task's date and time: ");
		i = scan.nextLine();
		setDateTime(i);
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
		
		setPayRate(d);
		
		System.out.print("Task: " + getTaskName() + 
				//This function is to be added soon
				//"\nCourse: " + getCourse() + 
				"\nDate and Time: " + getDateTime() + 
				"\nPay Rate: " + getPayRate());
	}
	
}
