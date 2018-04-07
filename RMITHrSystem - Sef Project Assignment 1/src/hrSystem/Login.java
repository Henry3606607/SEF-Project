package hrSystem;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;


public class Login {
		
		private static BufferedReader fileReader =  null;
		private static String token = "";
		private static String[] line;
	    private static User user;
		
public static boolean searchForUser(String id, String pWord) {
  		
  		try {
  			fileReader = new BufferedReader(new FileReader("src/userInformation.csv"));
  			//skip header
  			fileReader.readLine();
  			
  			while((token = fileReader.readLine()) != null) {
  				line = token.split(",");
  				if(line[0].equals(id)) {
  					if(line[1].equals(pWord)) {
  						user = new Admin(line[0]);
  						return true;
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
	    Scanner input = new Scanner(System.in);
		String staffId;
		String staffPassword;
	    boolean loggedIn = false;
	    
	    while(!loggedIn) {
		    System.out.println("username: ");
		    staffId = input.next();
		    System.out.println("password: ");
		    staffPassword = input.next();
		    if(searchForUser(staffId, staffPassword)) {
		    	System.out.println("You are logged in as user: "+ user.getRmitId());
		    	UserPortal.mainMenu(user);
		    	loggedIn = true;
		    }
		    else {
		    	System.out.println("Log in failed, try again \n");
		    }
	    }
	    
	    
  	}
  	
 
}
