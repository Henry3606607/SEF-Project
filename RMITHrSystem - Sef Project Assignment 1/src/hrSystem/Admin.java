package hrSystem;

import java.util.Scanner;

public class Admin extends User {
	String Rmitid;
	int userID;
	Task task;

	public Admin(String id, int userID) {
		this.setRmitId(id);
		this.setUserID(userID);
	}
	
}
