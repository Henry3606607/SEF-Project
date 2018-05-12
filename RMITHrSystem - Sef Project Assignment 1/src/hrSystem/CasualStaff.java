package hrSystem;

/*public class CasualStaff extends User {
	private String phoneNumber;
	private String fName;
	private String lName;
	
	public CasualStaff() {
	}	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}*/
package hrSystem;

import java.util.ArrayList;
import java.util.Scanner;


/*public class CasualStaff extends User {
	private String phoneNumber;
	private String fName;
	private String lName;
	
	public CasualStaff() {
	}	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
*/
public class CasualStaff {
    private String staffName;
    private int staffNumber;
    private int staffAge;
    private int yearStarted;
    private String RMITrole;


    public CasualStaff(String staffName, int staffAge, int yearStarted, int staffNumber, String role){
        this.staffName= staffName;
        this.staffNumber= staffNumber;
        this.staffAge= staffAge;
        this.yearStarted= yearStarted;
        this.RMITrole= RMITrole;            
    }

    public CasualStaff(){

    }

    public int getAge(){
        return staffAge;
    }

    public String getName(){
        return staffName;
    }

    public int getStaffNum(){
        return staffNumber;
    }

    public int getStartYear(){
        return yearStarted;
    }

    public CasualStaff addEmployee(){//this asks the new rmit employee questions, saves them in a employee object called rs

        Scanner in= new Scanner(System.in);
        //Employee d= new Employee();
        System.out.println("Please enter your Full name:");
        String name = in.nextLine();
        System.out.println("Please enter your age:");
        int age= Integer.parseInt(in.nextLine());
        System.out.println("Please enter your staff number:");
        int staffNum= Integer.parseInt (in.nextLine());
        System.out.println("Please enter year of current employment:");
        int startYear=Integer.parseInt(in.nextLine());
        System.out.println("Please enter role employment:");
        String role=in.nextLine();

        CasualStaff rs= new CasualStaff(name, age, startYear, staffNum, role);// puts all the varibles and puts them inside rs and returns it
        return rs;
    }



    public static void main(String[] args) {
        ArrayList<CasualStaff> alist= new ArrayList();// arraylist created to save employee objects
        AvailableTimes o= new AvailableTimes();// object created for access to main menu    
        o.menu();//display main menu

        CasualStaff RMIT = new CasualStaff();// create employee object to access add employee method

        for(CasualStaff count : alist){
            System.out.println(count.getName());
            System.out.println(count.getStaffNum());
        }
    }

	public void addCasualStaff() {
		
	}
}   
