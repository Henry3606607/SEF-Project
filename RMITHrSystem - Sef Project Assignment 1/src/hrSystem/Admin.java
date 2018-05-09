package hrSystem;

import java.util.Scanner;

public class Admin extends User {

	String id;
	String Rmitid;
	int userID;

public Admin() {
	
		
	}
	
    public void removeStaff(String Rmitid, String id) 
    {
    	

	}

	public static boolean addStaff() 
	{
		Scanner scan = new Scanner(System.in);
		String newStaff_RmitId, newStaff_fName, newStaff_lName, newStaff_pWord, newStaff_type;
		System.out.println("\n\nAdd a new staff member:\nEnter new staff RmitID:");
		newStaff_RmitId = scan.nextLine();
		if(newStaff_RmitId.matches("^[a-z]\\d{7}")) {
			System.out.println("yes it worked  " + newStaff_RmitId);
		}
		return true;
	}
	
	public void setRmitId(String Rmitid, String id)
	{
		
	}
	
	public void setUserID(int userID, String Rmitid)
	{
		
	}
	
	public String getId(String Rmitid, int userID) 
	{
		return id;
	}
	
	public void setId(String id, String setRmitId) 
	{
		setRmitId = id;
	}
	
	public String getName() 
	{
		return getName();
	}
	
	public void setName(String name, String getName) 
	{
		getName = name;
	}
	
	public String getDepartment() 
	{
	return getDepartment();
	}
	
	public void setDepartment(String department, String Department) 
	{
	Department = department;
	}
	
	public String getSalary() {
	return getSalary();
	}
	
	public void setSalary(String salary, String Salary) {
	Salary = salary;
	}
	

}
