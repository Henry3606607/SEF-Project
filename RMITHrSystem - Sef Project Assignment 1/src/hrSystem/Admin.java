package hrSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Admin extends User {

	String id;
	String Rmitid;
	int userID;
	private static BufferedReader fileReader =  null;

public Admin() {
	
		
	}
	
    public void removeStaff(String Rmitid, String id) 
    {
    	

	}

	public static boolean addStaff() 
	{
		Scanner scan = new Scanner(System.in);
		String confirmation, newStaff_RmitId, newStaff_fName, newStaff_lName, newStaff_pWord, newStaff_pWord2, newStaff_type;
		StringTokenizer temp;
		boolean type = false;
		System.out.println("\n\nAdd a new staff member\nEnter new staff RmitID:");
		newStaff_RmitId = scan.nextLine();
		while(!(newStaff_RmitId.matches("^[a-z]\\d{7}"))) {
			System.out.println("RmitID: " + newStaff_RmitId+" Does not match RMIT standard\n"
					+ "Please enter an id of format: e1234567");
			newStaff_RmitId = scan.nextLine();
		}
		System.out.println("Enter new Staff members full name:");
		newStaff_fName = scan.nextLine();
		temp = new StringTokenizer(newStaff_fName);
		newStaff_fName = temp.nextToken();
		newStaff_lName = temp.nextToken();
		
		System.out.println("Enter staff member type: Admin, Coordinator, Casual, Approver\n");
		newStaff_type = scan.nextLine();
		while(!type) {
			type=true;
			if(newStaff_type.equalsIgnoreCase("admin")) {
				newStaff_type = "Admin";
			}
			else if(newStaff_type.equalsIgnoreCase("coordinator")) {
				newStaff_type = "CourseCoordinator";
			}
			else if(newStaff_type.equalsIgnoreCase("casual")) {
				newStaff_type = "CasualStaff";
			}
			else if(newStaff_type.equalsIgnoreCase("approver")) {
				newStaff_type = "TimeApprover";				
			}
			else {
				System.out.println("Input Invalid\nEnter staff member type: Admin, Coordinator, Casual, Approver\n");
				newStaff_type = scan.nextLine();
				type = false;
			}
		}
		System.out.println("Enter staff password");
		newStaff_pWord = scan.nextLine();
		System.out.println("Enter staff password again");
		newStaff_pWord2 = scan.nextLine();
		while(!(newStaff_pWord.equals(newStaff_pWord2))) {
			System.out.println("Password does not match\nEnter staff password");
			newStaff_pWord = scan.nextLine();
			System.out.println("Enter staff password again");
			newStaff_pWord2 = scan.nextLine();
		}
		System.out.printf("Confirm User details:\nFirst Name: %s\nLastName: %s\nRMITID: %s\nUserType: %s\nUserPassword: %s", newStaff_fName, newStaff_lName, newStaff_RmitId, newStaff_type, newStaff_pWord);
		System.out.println("\nY to confirm N to cancel:");
		confirmation = scan.nextLine();
		if(confirmation.equalsIgnoreCase("y")) {
			String userArray[] = {newStaff_RmitId, newStaff_pWord,  newStaff_type, newStaff_fName, newStaff_lName};
			if(saveUserToFile(userArray)) {
				
			}
		}
		else {
			System.out.println("\nUser creation cancelled returning to main menu");
			return false;
		}
		return true;
	}
	
	public static boolean saveUserToFile(String[] userArray) {
		String line;
		String lastLine = null;
		String tokenized[];
		int currIndex;
		String content;
		try {
  			fileReader = new BufferedReader(new FileReader("src/userInformation.csv"));
  			//skip header
  			fileReader.readLine();
  			
  			while((line = fileReader.readLine()) != null) {
  				lastLine = line;
  			}
  			tokenized = lastLine.split(",");
  			currIndex = Integer.parseInt(tokenized[0]);
  			content = "\n" + Integer.toString(currIndex + 1);
  			fileReader.close();
		}
		catch(Exception e) {
  			System.out.println("Error reading file");
  			return false;
  		}
		
		FileWriter fw;
		try {
			fw = new FileWriter("src/userInformation.csv", true);
		} catch (IOException e) {
			System.out.println("Error reading file");
			return false;
		}
		for(int i=0; i<userArray.length; i++) {
			content = content + ","+userArray[i];
		}
		
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			bw.write(content);
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
