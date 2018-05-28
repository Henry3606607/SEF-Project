package hrSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
public class AvailableTimes {
	String[] times = {"Monday", "false","Tueday", "false","Wednesday", "false","Thursday", "false","Friday", "false"};

	public void updateAvailability() {
		
	}
	
	public String[] getTimes() {
		return this.times;
	}
}*/
// the way this works is it requires another class which is an issue. Also, this might not be the best way to do it.
public class AvailableTimes{
	private String DateAllocated;
	private String fName;
	private String lName;
	private String BSB;
	private int staffNumber;
	private CasualStaff staff;

public AvailableTimes(){
	this.fName = "Test";
	this.lName = "Test";
	this.DateAllocated = "Monday";
	this.BSB = "035-305";
	this.staffNumber = 3661022;
	this.staff = new CasualStaff();
}
public AvailableTimes(String fName, String lName, String DateAllocated, CasualStaff staff)
{
	this.fName = fName;
	this.lName = lName;
	this.DateAllocated = DateAllocated;
	this.BSB = BSB;
	this.staffNumber = staffNumber;
	this.staff = new CasualStaff();
}
public AvailableTimes(AvailableTimes at)
{
	this.fName = at.fName;
	this.lName = at.lName;
	this.DateAllocated = at.DateAllocated;
	this.BSB = at.BSB;
	this.staffNumber = at.staffNumber;
	this.staff = new CasualStaff();
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getBSB() {
	return BSB;
}
public void setBSB(String bSB) {
	BSB = bSB;
}
public String getDateAllocated() {
	return DateAllocated;
}
public void setDateAllocated(String dateAllocated) {
	DateAllocated = dateAllocated;
}
public CasualStaff getStaff() {
	return staff;
}
public void setStaff(CasualStaff staff) {
	this.staff = staff;
}
public int getStaffNumber() {
	return staffNumber;
}
public void setStaffNumber(int staffNumber) {
	this.staffNumber = staffNumber;
}


 

@Override
public String toString(){
	return this.staff+ "("+ DateAllocated + ")";
	

}
public void input(){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Employee time allocation: ");
	System.out.println("Enter First Name of Employee being allocated the time:");
	this.fName=in.nextLine();
	System.out.println("Enter Second Name of Employee being allocated the shift: ");
	this.lName=in.nextLine();
	this.DateAllocated.length();
}
public void print(){
	System.out.println("Name"+ this.fName+this.lName);
	System.out.println("Date Allocated"+ this.DateAllocated);
	
}
}
