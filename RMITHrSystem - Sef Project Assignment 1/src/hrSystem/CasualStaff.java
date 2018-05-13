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

import java.util.ArrayList;
import java.util.Scanner;
public class CasualStaff extends User {
	private String phoneNumber;
	private String fName;
	private String lName;
	private String BSB;
	private int staffNumber;
	private int staffPhone;


    public CasualStaff(String staffName, int staffAge, int yearStarted, int staffNumber, String role){
        this.fName= fName;
        this.staffNumber= staffNumber;
        this.lName= lName;
        this.BSB= BSB;
        this.staffPhone= staffPhone;            
    }

    public CasualStaff(){

    }

    public int getPhoneNumber(){
        return staffPhone;
    }

    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }


    public int getStaffNum(){
        return staffNumber;
    }

    public CasualStaff addCasualStaff(){//this asks the new employee questions, saves them in a employee object called e

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

        CasualStaff e= new CasualStaff(name, age, startYear, staffNum, role);// puts all the varibles and puts them inside e and returns it
        return e;
    }

    public static void main(String[] args) {
        ArrayList<CasualStaff> alist= new ArrayList();// arraylist created to save employee objects
        CasualStaffArray o= new CasualStaffArray();// object created for access to main menu    
        o.menu();//display main menu

        

        for(CasualStaff count : alist){
            System.out.println(count.getFirstName());
            System.out.println(count.getLastName());
            System.out.println(count.getStaffNum());
        }
    }
}   
class CasualStaffArray{

public void menu(){

    boolean breakOut= false;
    while(breakOut == false){
        System.out.println("=====================================");            
        System.out.println("=====================================");        
        System.out.println("Please choose the appropriate option: ");

        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("1) Enter new staff member details:");
        System.out.println("3) Display information on specific employee:");
        System.out.println("4) Display all file accounts:");
        System.out.println("5) Exit the program:");
        System.out.println("=====================================");

        Scanner in = new Scanner(System.in);    //scanner assigned to 'in'
        String choice = in.nextLine();  //user input stored in choice
        switch (choice){
            case "1": System.out.println("You chose the 'add staff' input");
                CasualStaff cs1= new CasualStaff();
                cs1.addCasualStaff();
                break;

            case "2": 
                System.out.println("You chose the 1st input");
                break;

            case "3":   
                System.out.println("You chose the 2nd input");
               //searchspecficEmployee();   
               break;

            case "4":
                System.out.println("You chose the 'display all' input");
                //displayAll();
                break;

            case "5":
                System.out.println("You chose to Exit.");
                breakOut= true;
                break;

            default:
                System.out.println("The input is not correct");
                break;
        }
    }   

}
}

