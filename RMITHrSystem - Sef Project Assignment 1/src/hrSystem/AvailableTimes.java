package hrSystem;

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
public class AvailableTimes{

public void menu(){

    boolean breakOut= false;
    while(breakOut == false){
        System.out.println("=====================================");            
        System.out.println("=====================================");        
        System.out.println("Please choose the appropriate option: ");

        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("1) Enter new employee details:");
        System.out.println("2) Display the employee average age:");
        System.out.println("3) Display information on specific employee:");
        System.out.println("4) Display all file accounts:");
        System.out.println("5) Exit the program:");
        System.out.println("=====================================");

        Scanner in = new Scanner(System.in);    //scanner assigned to 'in'
        String choice = in.nextLine();  //user input stored in choice

        switch (choice){
            case "1": System.out.println("You chose the 'add employee' input");
                CasualStaff e1= new CasualStaff();
                e1.addCasualStaff();
                break;

            case "2": 
                System.out.println("You chose the b input");
                break;

            case "3":   
                System.out.println("You chose the c input");
               //searchspecficRMITstaff  
               break;

            case "4":
                System.out.println("You chose the 'display all' input");
                //displays whatever you inputted
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
