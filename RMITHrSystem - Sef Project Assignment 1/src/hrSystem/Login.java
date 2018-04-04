package hrSystem;
import java.util.Scanner;

public class Login {
  	public static void main(String[] args) {
      // bit of an idea
	    Scanner input = new Scanner(System.in);

	    String staffusername;
	    String staffpassword;

	    System.out.println("Log in:");
	    System.out.println("username: ");
	    staffusername = input.next();

	    System.out.println("password: ");
	    staffpassword = input.next();

	    //checks username and password
	    if(staffusername.equals(staffusername) && staffpassword.equals(staffpassword)) 
	        System.out.println("You are logged in");

}
