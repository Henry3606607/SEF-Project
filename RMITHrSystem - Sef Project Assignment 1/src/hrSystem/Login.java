package hrSystem;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;


public class Login {
		
		private static BufferedReader fileReader =  null;
		private static String token = "";
		private static String[] line;
	    private static User user;
	    
public static User findUserType(String userType, String uName, int userID) {
	if(userType.equals("Admin")) {
		return new Admin(uName, userID);
	}
	else if(userType.equals("CourseCoordinator")) {
		return new CourseCoordinator(uName, userID);
	}
	else if(userType.equals("TimeApprover")) {
		return new TimeApprover(uName, userID);
	}
	else if(userType.equals("CasualStaff")) {
		return new CasualStaff(uName, userID);
	}
	else {
		return null;
	}
}
		
public static boolean searchForUser(String id, String pWord) {
  		
  		try {
  			fileReader = new BufferedReader(new FileReader("src/userInformation.csv"));
  			//skip header
  			fileReader.readLine();
  			
  			while((token = fileReader.readLine()) != null) {
  				line = token.split(",");
  				if(line[1].equals(id)) {
  					if(line[2].equals(pWord)) {
  						user = findUserType(line[3], line[1], Integer.parseInt(line[0]));
  						if(user != null) {
  							user.initUserInformation(line[4], line[5]);
  							return true;
  						}
  						else {
  							return false;
  						}
  					}
  					System.out.println("Password Incorrect");
  					return false;
  				}
  				
  			}
  			fileReader.close();
  		}
  		catch(Exception e) {
  			System.out.println("Error reading file");
  		}
  		
  		return false;
  	}

  	public static void main(String[] args) {
	    login();
  	}
  	
  	private static void login() {
  		Scanner input = new Scanner(System.in);
		String staffId;
		String staffPassword;
	    boolean loggedIn = false;
	    
	    while(!loggedIn) {
		    System.out.println("Login:\nusername: ");
		    staffId = input.next();
		    System.out.println("password: ");
		    staffPassword = input.next();
		    if(searchForUser(staffId, staffPassword)) {
		    	System.out.println("You are logged in as user: "+ user.getRmitId());
		    	UserPortal.mainMenu(user);
		    	loggedIn = true;
			    input.close();

		    }
		    else {
		    	System.out.println("Log in failed, try again \n");
		    }
	    }
	    
  	}
  	
 
}
